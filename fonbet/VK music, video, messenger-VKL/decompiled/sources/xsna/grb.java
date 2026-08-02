package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.vk.clips.sdk.shared.FavoriteFolderId;
import com.vk.im.engine.models.messages.Msg;
import com.vk.profile.community.impl.ui.trust_mark.CommunityTrustMarksArgs;
import com.vk.profile.community.impl.ui.trust_mark.c;
import com.vk.superapp.browser.internal.commands.controller.VkUiCommand;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import xsna.d4e;
import xsna.hud0;
import xsna.irb;
import xsna.t5e;
import xsna.vm30;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class grb implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ grb(View view, Rect rect, RectF rectF) {
        this.b = 5;
        this.d = view;
        this.c = rect;
        this.e = rectF;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c0, code lost:
    
        if (r3 != (-1)) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c2, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c8, code lost:
    
        if (r0 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ca, code lost:
    
        xsna.myc0.h(r1, null, null, new xsna.nye.a(r2, r0.intValue(), null), 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d9, code lost:
    
        return xsna.s3q0.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c4, code lost:
    
        r0 = java.lang.Integer.valueOf(r3);
     */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        ovv0 J;
        dvv0 a;
        switch (this.b) {
            case 0:
                irb irbVar = (irb) this.c;
                View view = (View) this.d;
                irb.b bVar = (irb.b) this.e;
                irbVar.l = null;
                ViewGroup viewGroup = (ViewGroup) view;
                viewGroup.setPivotX(viewGroup.getWidth() / 2.0f);
                viewGroup.setPivotY(viewGroup.getHeight() / 2.0f);
                int i = 1;
                view.animate().alpha(1.0f).scaleX(0.9f).scaleY(0.9f).setUpdateListener(new hrb(bVar, 0)).withStartAction(new bv9(irbVar, i)).withEndAction(new tn9(irbVar, i)).setInterpolator(new j8z()).setDuration(220L).start();
                return s3q0.a;
            case 1:
                return new p5s0((q1d) this.d, (ptc0) this.e, (ViewGroup) ((o1d) this.c).findViewById(R.id.fullscreen_clip_container));
            case 2:
                h5e h5eVar = (h5e) this.c;
                FavoriteFolderId.Id id = (FavoriteFolderId.Id) this.d;
                String str = (String) this.e;
                h5eVar.c.g(new d4e.a.e(id));
                h5eVar.b.d(new t5e.n(str), null);
                return s3q0.a;
            case 3:
                List list = (List) this.c;
                yvj yvjVar = (yvj) this.d;
                mc90 mc90Var = (mc90) this.e;
                Iterator it = list.iterator();
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                        break;
                    } else {
                        Object next = it.next();
                        if (i2 < 0) {
                            e43.t();
                            throw null;
                        }
                        if (((hud0) next) instanceof hud0.b.a) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            case 4:
                ((izs) this.c).invoke(new c.b(((CommunityTrustMarksArgs.TrustMarkData) this.d).b, (CommunityTrustMarksArgs.AdminButtons) this.e));
                return s3q0.a;
            case 5:
                View view2 = (View) this.d;
                Rect rect = (Rect) this.c;
                RectF rectF = (RectF) this.e;
                view2.getGlobalVisibleRect(rect);
                rectF.set(rect);
                return rectF;
            case 6:
                r6y r6yVar = (r6y) this.c;
                VkUiCommand vkUiCommand = (VkUiCommand) this.d;
                String str2 = (String) this.e;
                fvv0 M = r6yVar.M();
                if (M != null && (J = M.J()) != null && (a = J.a(vkUiCommand)) != null) {
                    a.a(str2);
                }
                return s3q0.a;
            case 7:
                vm30.o oVar = (vm30.o) this.c;
                vm30 vm30Var = (vm30) this.d;
                Msg msg = (Msg) this.e;
                oVar.invoke();
                ym30 ym30Var = vm30Var.t0;
                if (ym30Var != null) {
                    ym30Var.t0(msg);
                }
                return s3q0.a;
            default:
                Context context = (Context) this.c;
                String str3 = (String) this.d;
                Uri uri = (Uri) this.e;
                enj.q(R.string.vkim_download_started, 0, context);
                vao.b(context, str3, uri.toString(), true, null, Boolean.TRUE, false);
                return s3q0.a;
        }
    }

    public /* synthetic */ grb(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
