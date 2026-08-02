package com.yandex.messaging.internal.view.stickers.bottomsheet;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.core.net.entities.StickerPacksData;
import com.yandex.messaging.input.bricks.writing.e;
import com.yandex.messaging.input.g;
import com.yandex.messaging.internal.authorized.j;
import com.yandex.messaging.internal.view.stickers.AutoSpanGridLayoutManager;
import com.yandex.messaging.internal.view.stickers.StickersView;
import com.yandex.messaging.internal.view.stickers.bottomsheet.StickerPanelBottomSheet;
import defpackage.cdu0;
import defpackage.ct21;
import defpackage.dct;
import defpackage.e1k;
import defpackage.e9e;
import defpackage.e9h0;
import defpackage.gvg0;
import defpackage.hcu0;
import defpackage.j3b;
import defpackage.jcu0;
import defpackage.kcu0;
import defpackage.mae0;
import defpackage.olh0;
import defpackage.oyh0;
import defpackage.p4t;
import defpackage.reu;
import defpackage.scu0;
import defpackage.t26;
import defpackage.tcu0;
import defpackage.tje;
import defpackage.w0i0;
import defpackage.x22;
import defpackage.xav;
import defpackage.z83;

/* loaded from: classes15.dex */
public class StickerPanelBottomSheet extends BottomSheetDialog {
    private final String mAddText;
    private final x22 mAnalytics;
    private e1k mApiRequest;
    private j3b mChatInfo;
    private final ChatRequest mChatRequest;
    private e1k mChatViewSubscription;
    private final String mDeleteText;
    private final TextView mDescriptionTextView;
    private final p4t mGetChatInfoUseCase;
    private final dct mGetRateLimitUseCase;
    private final AutoSpanGridLayoutManager mGridLayoutManager;
    private final String mPackId;
    private e1k mRateLimitSubscription;
    private final kcu0 mStickerPackStateObservable;
    private final hcu0 mStickerPanelAdapter;
    private final tcu0 mStickerSheetListener;
    private final cdu0 mStickersActions;
    private e1k mStickersSubscription;
    private final g mTimelineSendMessageFacade;
    private final TextView mTitleTextView;
    private long mWaitFor;

    public StickerPanelBottomSheet(Context context, kcu0 kcu0Var, p4t p4tVar, dct dctVar, String str, cdu0 cdu0Var, xav xavVar, mae0 mae0Var, ChatRequest chatRequest, g gVar, x22 x22Var, tcu0 tcu0Var) {
        super(context, w0i0.Messaging_Theme_BottomSheetDialog);
        this.mAnalytics = x22Var;
        this.mStickerSheetListener = tcu0Var;
        setCancelable(true);
        setCanceledOnTouchOutside(true);
        setContentView(olh0.msg_d_sticker_menu);
        this.mTimelineSendMessageFacade = gVar;
        BottomSheetBehavior.D((View) findViewById(e9h0.sticker_panel).getParent()).V(context.getResources().getDimensionPixelSize(gvg0.sticker_panel_peek_height), false);
        this.mTitleTextView = (TextView) findViewById(e9h0.sticker_pack_name);
        this.mDescriptionTextView = (TextView) findViewById(e9h0.sticker_pack_author);
        this.mStickerPackStateObservable = kcu0Var;
        this.mGetChatInfoUseCase = p4tVar;
        this.mGetRateLimitUseCase = dctVar;
        this.mPackId = str;
        this.mStickersActions = cdu0Var;
        this.mChatRequest = chatRequest;
        this.mDeleteText = context.getString(oyh0.delete_confirm);
        this.mAddText = context.getString(oyh0.add_confirm);
        AutoSpanGridLayoutManager autoSpanGridLayoutManager = new AutoSpanGridLayoutManager(context, context.getResources().getDimensionPixelSize(gvg0.emoji_sticker_image_height));
        this.mGridLayoutManager = autoSpanGridLayoutManager;
        hcu0 hcu0Var = new hcu0(xavVar);
        this.mStickerPanelAdapter = hcu0Var;
        hcu0Var.c = new t26(this, context, str);
        StickersView stickersView = (StickersView) findViewById(e9h0.stickers_view);
        stickersView.setLayoutManager(autoSpanGridLayoutManager);
        stickersView.setAdapter(hcu0Var);
        stickersView.setStickerPreviewer(mae0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$new$0(Context context, String str, String str2, String str3) {
        long j = this.mWaitFor;
        if (j > 0) {
            this.mAnalytics.f("rate limiter toast shown", "chat_id", this.mChatInfo.b, "wait_for", Long.valueOf(j));
            Toast.makeText(context, oyh0.messaging_sending_messages_temporary_blocked, 0).show();
            return;
        }
        this.mTimelineSendMessageFacade.e(str, str3);
        tcu0 tcu0Var = this.mStickerSheetListener;
        if (tcu0Var != null) {
            e eVar = (e) ((reu) tcu0Var).b;
            if (eVar.v != null) {
                eVar.v = null;
                eVar.f();
            }
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onRateLimitChanged(long j) {
        this.mWaitFor = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChatInfo(j3b j3bVar) {
        this.mChatInfo = j3bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStickerPackData(StickerPacksData.PackData packData) {
        this.mTitleTextView.setText(packData.title);
        this.mDescriptionTextView.setText(packData.description);
        hcu0 hcu0Var = this.mStickerPanelAdapter;
        String str = packData.packId;
        hcu0Var.b = packData.stickers;
        hcu0Var.w = str;
        hcu0Var.notifyDataSetChanged();
    }

    private e1k subscribePackState(BottomSheetDialog bottomSheetDialog, String str) {
        TextView textView = (TextView) bottomSheetDialog.findViewById(e9h0.confirm_button);
        z83.d(textView, null);
        kcu0 kcu0Var = this.mStickerPackStateObservable;
        scu0 scu0Var = new scu0(this, textView, str, bottomSheetDialog);
        kcu0Var.getClass();
        tje.e();
        j jVar = (j) kcu0Var.d.get();
        jcu0 jcu0Var = new jcu0(kcu0Var, str, scu0Var);
        jVar.getClass();
        return new ct21(jVar, jcu0Var);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onStart() {
        super.onStart();
        this.mStickersSubscription = subscribePackState(this, this.mPackId);
        final int i = 0;
        this.mChatViewSubscription = this.mGetChatInfoUseCase.c(this.mChatRequest, new e9e(this) { // from class: qcu0
            public final /* synthetic */ StickerPanelBottomSheet b;

            {
                this.b = this;
            }

            @Override // defpackage.e9e
            public final void accept(Object obj) {
                int i2 = i;
                StickerPanelBottomSheet stickerPanelBottomSheet = this.b;
                switch (i2) {
                    case 0:
                        stickerPanelBottomSheet.setChatInfo((j3b) obj);
                        break;
                    default:
                        stickerPanelBottomSheet.onRateLimitChanged(((Long) obj).longValue());
                        break;
                }
            }
        });
        final int i2 = 1;
        this.mRateLimitSubscription = this.mGetRateLimitUseCase.c(this.mChatRequest, new e9e(this) { // from class: qcu0
            public final /* synthetic */ StickerPanelBottomSheet b;

            {
                this.b = this;
            }

            @Override // defpackage.e9e
            public final void accept(Object obj) {
                int i22 = i2;
                StickerPanelBottomSheet stickerPanelBottomSheet = this.b;
                switch (i22) {
                    case 0:
                        stickerPanelBottomSheet.setChatInfo((j3b) obj);
                        break;
                    default:
                        stickerPanelBottomSheet.onRateLimitChanged(((Long) obj).longValue());
                        break;
                }
            }
        });
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onStop() {
        super.onStop();
        e1k e1kVar = this.mStickersSubscription;
        if (e1kVar != null) {
            e1kVar.close();
            this.mStickersSubscription = null;
        }
        e1k e1kVar2 = this.mChatViewSubscription;
        if (e1kVar2 != null) {
            e1kVar2.close();
            this.mChatViewSubscription = null;
        }
        e1k e1kVar3 = this.mRateLimitSubscription;
        if (e1kVar3 != null) {
            e1kVar3.close();
            this.mRateLimitSubscription = null;
        }
        e1k e1kVar4 = this.mApiRequest;
        if (e1kVar4 != null) {
            e1kVar4.close();
            this.mApiRequest = null;
        }
        tcu0 tcu0Var = this.mStickerSheetListener;
        if (tcu0Var != null) {
            e eVar = (e) ((reu) tcu0Var).b;
            if (eVar.v != null) {
                eVar.v = null;
                eVar.b(false);
                eVar.d();
            }
        }
    }
}
