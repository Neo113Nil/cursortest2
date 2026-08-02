package com.yandex.messaging.ui.yadisk;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.ExistingChatRequest;
import com.yandex.messaging.internal.pending.OutgoingAttachment$ExistingAttachment;
import com.yandex.messaging.ui.yadisk.a;
import defpackage.ai91;
import defpackage.b00;
import defpackage.bvf0;
import defpackage.dk51;
import defpackage.e9h0;
import defpackage.ek51;
import defpackage.hi91;
import defpackage.i3y;
import defpackage.ike;
import defpackage.kse;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.olh0;
import defpackage.pw91;
import defpackage.sfl0;
import defpackage.sls;
import defpackage.tje;
import defpackage.tw80;
import defpackage.uw80;
import defpackage.w0i0;
import defpackage.w511;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class a {
    public final Activity a;
    public final sfl0 b;
    public final kse c;
    public final b00 d;
    public String e;
    public ChatRequest f;
    public final TextView g;
    public final View h;
    public final View i;
    public final ImageView j;
    public final TextView k;
    public final TextView l;
    public final TextView m;
    public final TextView n;
    public final i3y o;
    public final i3y p;
    public final BottomSheetDialog q;
    public final dk51 r;
    public final ike s;

    public a(Activity activity, sfl0 sfl0Var, kse kseVar, b00 b00Var) {
        this.a = activity;
        this.b = sfl0Var;
        this.c = kseVar;
        this.d = b00Var;
        final int i = 0;
        this.o = kotlin.a.a(new sls(this) { // from class: a83
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                a aVar = this.b;
                switch (i2) {
                    case 0:
                        Activity activity2 = aVar.a;
                        return activity2.getResources().getDrawable(wwg0.msg_ic_image, activity2.getTheme());
                    default:
                        Activity activity3 = aVar.a;
                        return activity3.getResources().getDrawable(wwg0.msg_ic_file, activity3.getTheme());
                }
            }
        });
        final int i2 = 1;
        this.p = kotlin.a.a(new sls(this) { // from class: a83
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                a aVar = this.b;
                switch (i22) {
                    case 0:
                        Activity activity2 = aVar.a;
                        return activity2.getResources().getDrawable(wwg0.msg_ic_image, activity2.getTheme());
                    default:
                        Activity activity3 = aVar.a;
                        return activity3.getResources().getDrawable(wwg0.msg_ic_file, activity3.getTheme());
                }
            }
        });
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(activity, w0i0.Messaging_Theme_BottomSheetDialog);
        bottomSheetDialog.setContentView(olh0.msg_d_bottom_sheet_ask_disk_space);
        bottomSheetDialog.setCanceledOnTouchOutside(true);
        this.q = bottomSheetDialog;
        this.r = new dk51(activity);
        this.s = bvf0.a(kseVar.b);
        TextView textView = (TextView) bottomSheetDialog.findViewById(e9h0.ask_disk_space_delete_btn);
        if (textView == null) {
            ny61.r("view not found");
            throw null;
        }
        this.g = textView;
        View findViewById = bottomSheetDialog.findViewById(e9h0.ask_disk_space_repeat_btn);
        if (findViewById == null) {
            ny61.r("view not found");
            throw null;
        }
        this.h = findViewById;
        View findViewById2 = bottomSheetDialog.findViewById(e9h0.ask_disk_space_cancel_btn);
        if (findViewById2 == null) {
            ny61.r("view not found");
            throw null;
        }
        this.i = findViewById2;
        TextView textView2 = (TextView) bottomSheetDialog.findViewById(e9h0.ask_disk_space_file_name);
        if (textView2 == null) {
            ny61.r("view not found");
            throw null;
        }
        this.k = textView2;
        TextView textView3 = (TextView) bottomSheetDialog.findViewById(e9h0.ask_disk_space_file_size);
        if (textView3 == null) {
            ny61.r("view not found");
            throw null;
        }
        this.l = textView3;
        ImageView imageView = (ImageView) bottomSheetDialog.findViewById(e9h0.ask_disk_space_file_icon);
        if (imageView == null) {
            ny61.r("view not found");
            throw null;
        }
        this.j = imageView;
        TextView textView4 = (TextView) bottomSheetDialog.findViewById(e9h0.ask_disk_space_title);
        if (textView4 == null) {
            ny61.r("view not found");
            throw null;
        }
        this.m = textView4;
        TextView textView5 = (TextView) bottomSheetDialog.findViewById(e9h0.ask_disk_space_text);
        if (textView5 == null) {
            ny61.r("view not found");
            throw null;
        }
        this.n = textView5;
        hi91.g(new AskDiskSpaceDialog$1(this, null), findViewById);
        hi91.g(new AskDiskSpaceDialog$2(this, null), findViewById2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, uw80 uw80Var, ContinuationImpl continuationImpl) {
        AskDiskSpaceDialog$fileName$1 askDiskSpaceDialog$fileName$1;
        int i;
        aVar.getClass();
        if (continuationImpl instanceof AskDiskSpaceDialog$fileName$1) {
            askDiskSpaceDialog$fileName$1 = (AskDiskSpaceDialog$fileName$1) continuationImpl;
            int i2 = askDiskSpaceDialog$fileName$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                askDiskSpaceDialog$fileName$1.label = i2 - Integer.MIN_VALUE;
                Object obj = askDiskSpaceDialog$fileName$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = askDiskSpaceDialog$fileName$1.label;
                if (i != 0) {
                    b.b(obj);
                    if (!(uw80Var instanceof tw80)) {
                        if (uw80Var instanceof OutgoingAttachment$ExistingAttachment) {
                            return ((OutgoingAttachment$ExistingAttachment) uw80Var).getFileName();
                        }
                        w511.b();
                        return null;
                    }
                    mdh mdhVar = aVar.c.d;
                    AskDiskSpaceDialog$fileName$2 askDiskSpaceDialog$fileName$2 = new AskDiskSpaceDialog$fileName$2(uw80Var, aVar, null);
                    askDiskSpaceDialog$fileName$1.label = 1;
                    obj = tje.k0(mdhVar, askDiskSpaceDialog$fileName$2, askDiskSpaceDialog$fileName$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return (String) obj;
            }
        }
        askDiskSpaceDialog$fileName$1 = new AskDiskSpaceDialog$fileName$1(aVar, continuationImpl);
        Object obj2 = askDiskSpaceDialog$fileName$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = askDiskSpaceDialog$fileName$1.label;
        if (i != 0) {
        }
        return (String) obj2;
    }

    public static final Object b(uw80 uw80Var, a aVar, Continuation continuation) {
        if (uw80Var instanceof tw80) {
            return tje.k0(aVar.c.d, new AskDiskSpaceDialog$fileSize$2(uw80Var, aVar, null), continuation);
        }
        aVar.getClass();
        if (uw80Var instanceof OutgoingAttachment$ExistingAttachment) {
            return new Long(((OutgoingAttachment$ExistingAttachment) uw80Var).getFileSize());
        }
        w511.b();
        return null;
    }

    public final void c(ExistingChatRequest existingChatRequest, ek51 ek51Var, pw91 pw91Var) {
        this.f = existingChatRequest;
        List list = ek51Var.c;
        if (list.isEmpty()) {
            return;
        }
        BottomSheetDialog bottomSheetDialog = this.q;
        if (bottomSheetDialog.isShowing()) {
            return;
        }
        Integer e = pw91Var.e();
        String f = pw91Var.f();
        int s = pw91Var.s(ek51Var);
        Activity activity = this.a;
        this.m.setText(activity.getString(s));
        this.n.setText(activity.getString(pw91Var.q()));
        boolean z = e != null;
        TextView textView = this.g;
        ai91.e(textView, z);
        if (e != null) {
            textView.setText(activity.getString(e.intValue()));
            hi91.g(new AskDiskSpaceDialog$show$1$1(this, f, null), textView);
        }
        this.e = ek51Var.a;
        this.j.setImageDrawable(ek51Var.b ? (Drawable) this.o.getValue() : (Drawable) this.p.getValue());
        tje.N(this.s, null, null, new AskDiskSpaceDialog$show$2(this, list, null), 3);
        bottomSheetDialog.show();
    }
}
