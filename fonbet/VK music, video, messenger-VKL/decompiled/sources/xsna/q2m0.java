package xsna;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import android.view.View;
import android.view.textclassifier.TextClassification;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.dto.gift.GiftItem;
import com.vk.media.pipeline.gl.GlException;
import com.vk.messagetemplates.impl.keyboard.h;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.superapp.api.dto.auth.VkAuthAppScope;
import com.vkontakte.android.R;
import java.util.List;
import xsna.kes0;
import xsna.r6p0;
import xsna.wqs0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class q2m0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q2m0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        ActivityOptions pendingIntentBackgroundActivityStartMode;
        switch (this.b) {
            case 0:
                View view = (View) this.c;
                jzl0 jzl0Var = (jzl0) this.d;
                view.getParent().requestDisallowInterceptTouchEvent(false);
                jzl0Var.l(false);
                nzl0 nzl0Var = jzl0Var.a.D;
                if (nzl0Var != null) {
                    nzl0Var.r();
                }
                return s3q0.a;
            case 1:
                izs izsVar = (izs) this.c;
                h.a aVar = (h.a) this.d;
                izsVar.invoke(new i9o0(aVar.a, aVar.c));
                return s3q0.a;
            case 2:
                Context context = (Context) this.c;
                TextClassification textClassification = (TextClassification) this.d;
                String text = textClassification.getText();
                PendingIntent activity = PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592);
                if (Build.VERSION.SDK_INT >= 34) {
                    try {
                        pendingIntentBackgroundActivityStartMode = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1);
                        activity.send(pendingIntentBackgroundActivityStartMode.toBundle());
                    } catch (PendingIntent.CanceledException e) {
                        Log.e("TextClassification", "error sending pendingIntent: " + activity + " error: " + e);
                    }
                } else {
                    activity.send();
                }
                return s3q0.a;
            case 3:
                r6p0.a aVar2 = (r6p0.a) this.c;
                gzs gzsVar = (gzs) this.d;
                aVar2.a();
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 4:
                ((inq0) this.c).x6(((GiftItem) this.d).f);
                return s3q0.a;
            case 5:
                ((izs) this.c).invoke(new UserProfileAction.DonutBanner.UrlClick((String) this.d, UserProfileAction.DonutBanner.UrlClick.Source.Faq));
                return s3q0.a;
            case 6:
                ((izs) this.c).invoke(new wqs0.f.a((BlockId.CompositeId) this.d));
                return s3q0.a;
            case 7:
                nat0 nat0Var = (nat0) this.c;
                oat0 oat0Var = nat0Var.e;
                Bitmap bitmap = nat0Var.f;
                csp cspVar = (csp) this.d;
                try {
                    o6t0 o6t0Var = oat0Var.a;
                    return kes0.a.a(oat0Var.b, o6t0Var.b, new Size(bitmap.getWidth(), bitmap.getHeight()), o6t0Var.c, cspVar.d, true);
                } catch (Throwable th) {
                    throw new GlException("Failed to create VideoRawProducer surface (" + bitmap.getWidth() + 'x' + bitmap.getHeight() + ')', th);
                }
            case 8:
                List list = (List) this.d;
                VkAuthAppScope vkAuthAppScope = new VkAuthAppScope("general_info", ((View) this.c).getContext().getString(R.string.vk_apps_request_access_main_info), null);
                if (list.isEmpty()) {
                    list = j5g.v0(vkAuthAppScope, list);
                }
                return io.reactivex.rxjava3.core.q.T(list);
            default:
                wzs wzsVar = (wzs) this.c;
                h0w0 h0w0Var = (h0w0) this.d;
                wzsVar.invoke(h0w0Var.d().f, h0w0Var.d().g);
                return s3q0.a;
        }
    }

    public /* synthetic */ q2m0(View view, List list) {
        this.b = 8;
        this.d = list;
        this.c = view;
    }
}
