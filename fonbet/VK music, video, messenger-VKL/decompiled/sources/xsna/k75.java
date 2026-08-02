package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.ActionMode;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.text.Handle;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.common.VideoFile;
import com.vk.dto.photo.Photo;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.friends.impl.friends.presentation.fragment.FriendsSelectionFragment;
import com.vk.stickers.views.LongtapRecyclerView;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import one.video.stat.transport.internal.upload.UploadExecutionResult;
import xsna.b4;
import xsna.bph0;
import xsna.cei0;
import xsna.dzf0;
import xsna.g650;
import xsna.vre;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class k75 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ k75(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v69, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        gzs<s3q0> gzsVar;
        switch (this.b) {
            case 0:
                b4.c.h hVar = (b4.c.h) this.c;
                q75 q75Var = (q75) this.d;
                if (hVar == null || (gzsVar = hVar.b) == null) {
                    jyr0.a(R.drawable.vk_icon_check_circle_outline_28, R.string.video_unsubscribed_message, q75Var.a);
                } else {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 1:
                o1d o1dVar = (o1d) this.c;
                Context context = (Context) this.d;
                ic icVar = new ic(o1dVar, 22);
                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
                Lazy a = msy.a(lazyThreadSafetyMode, icVar);
                int i = 5;
                return new c2d(msy.a(lazyThreadSafetyMode, new defpackage.u(i, o1dVar, context)), msy.a(lazyThreadSafetyMode, new ig1(i, o1dVar, a)), a, o1dVar.R);
            case 2:
                return "PlaylistsUi | REORDER CHANGED INDICES " + j5g.g0((List) this.c, null, null, null, 0, new ob(13), 31) + "\nwith offset " + ((vre.b) this.d).s;
            case 3:
                ((reh) this.c).t.a((VideoFile) this.d);
                return s3q0.a;
            case 4:
                ((sem) this.c).d(((MenuItem) this.d).getItemId());
                return s3q0.a;
            case 5:
                ((r580) this.c).c(((azn) this.d).d);
                return s3q0.a;
            case 6:
                List list = (List) this.c;
                mqp mqpVar = (mqp) this.d;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    mqpVar.b.C0((NewsEntry) it.next());
                }
                return s3q0.a;
            case 7:
                FriendsSelectionFragment friendsSelectionFragment = (FriendsSelectionFragment) this.c;
                ActionMode actionMode = (ActionMode) this.d;
                friendsSelectionFragment.p0 = new y3i(friendsSelectionFragment, 11);
                actionMode.finish();
                return s3q0.a;
            case 8:
                gzs gzsVar2 = (gzs) this.c;
                a2t a2tVar = (a2t) this.d;
                if (gzsVar2 != null) {
                    gzsVar2.invoke();
                }
                dzf0 dzf0Var = a2tVar.b;
                if (dzf0Var != null) {
                    dzf0.a aVar = dzf0Var.i;
                    int i2 = aVar.a;
                    if (!aVar.hasMessages(i2)) {
                        aVar.sendEmptyMessage(i2);
                    }
                }
                return s3q0.a;
            case 9:
                s90 s90Var = (s90) this.c;
                w8t w8tVar = (w8t) this.d;
                uet uetVar = s90Var.b;
                if (uetVar != null) {
                    w8tVar.c.invoke(uetVar);
                }
                return s3q0.a;
            case 10:
                ((xnt) this.c).x((qwz) this.d);
                return s3q0.a;
            case 11:
                ((z520) this.c).k((Photo) this.d);
                return s3q0.a;
            case 12:
                Throwable th = (Throwable) this.c;
                im90 im90Var = (im90) this.d;
                if (th instanceof VKApiExecutionException) {
                    int s = ((VKApiExecutionException) th).s();
                    if (s == 9) {
                        im90Var.c.a(wbu0.a(im90Var.a, th, true).a, false);
                    } else if (s == 15) {
                        im90Var.b.hh(im90Var.a.getString(R.string.vk_connect_ask_password_wrong_pass));
                    }
                } else {
                    im90Var.b.hh(im90Var.a.getString(R.string.vk_auth_load_network_error));
                }
                return s3q0.a;
            case 13:
                ((izs) this.c).invoke(new bph0.a(((ykt) this.d).b));
                return s3q0.a;
            case 14:
                bei0 bei0Var = (bei0) this.c;
                long j = ((q9x) ((wh50) this.d).getValue()).a;
                obi0 f = bei0Var.f();
                long j2 = 9205357640488583168L;
                if (f != null) {
                    Handle e = bei0Var.e();
                    int i3 = e == null ? -1 : cei0.a.$EnumSwitchMapping$0[e.ordinal()];
                    if (i3 != -1) {
                        if (i3 == 1) {
                            j2 = cei0.b(bei0Var, j, f.a);
                        } else {
                            if (i3 != 2) {
                                if (i3 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                throw new IllegalStateException("SelectionContainer does not support cursor");
                            }
                            j2 = cei0.b(bei0Var, j, f.b);
                        }
                    }
                }
                return new ov70(j2);
            case 15:
                po5 po5Var = (po5) this.c;
                ixi0 ixi0Var = (ixi0) this.d;
                qjg0 qjg0Var = new qjg0(po5Var, 2);
                zwi0 zwi0Var = new zwi0();
                zwi0Var.x0(axi0.class, new fv90(qjg0Var, 23));
                ((RecyclerView) ixi0Var.f.getValue()).setAdapter(zwi0Var);
                return zwi0Var;
            case 16:
                ((xck0) this.c).m.invoke(new g650.a.c(((nck0) this.d).e));
                return s3q0.a;
            case 17:
                o7l0 o7l0Var = (o7l0) this.c;
                ViewGroup viewGroup = (ViewGroup) this.d;
                int[] iArr = new int[2];
                o7l0Var.c.getLocationInWindow(iArr);
                int i4 = iArr[1];
                LongtapRecyclerView longtapRecyclerView = o7l0Var.c;
                int height = longtapRecyclerView.getHeight() + i4;
                int[] iArr2 = new int[2];
                viewGroup.getLocationInWindow(iArr2);
                int i5 = height - iArr2[1];
                if (i5 < 0) {
                    i5 = 0;
                }
                longtapRecyclerView.setClipToPadding(false);
                int i6 = i5 - o7l0Var.g;
                f4m.v(i6 >= 0 ? i6 : 0, longtapRecyclerView);
                return s3q0.a;
            case 18:
                lmn0 lmn0Var = (lmn0) this.c;
                Context context2 = (Context) this.d;
                lmn0Var.getClass();
                Drawable c = enj.c(R.drawable.vk_icon_reply_outline_20, e3m.f(R.attr.vk_ui_icon_contrast, context2), context2);
                Drawable a2 = m33.a(R.drawable.bg_vkim_channel_share, context2);
                a2.setTint(dhr0.t.c(R.attr.vk_ui_icon_tertiary_alpha));
                int b = cn70.b(36);
                int b2 = cn70.b(28);
                int b3 = cn70.b(8);
                int b4 = cn70.b(4);
                LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{a2, c});
                layerDrawable.setLayerSize(0, b, b2);
                layerDrawable.setLayerInset(1, b3, b4, b3, b4);
                return layerDrawable;
            case 19:
                return "notifyFileLoadingResult: result " + ((UploadExecutionResult) this.c) + " for file " + ((dbq0) this.d).a.getName() + " ";
            case 20:
                com.vk.im.ui.components.viewcontrollers.msg_list.adapter.vh.a aVar2 = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.vh.a) this.c;
                View view = (View) this.d;
                Drawable a3 = m33.a(R.drawable.vkim_add_reaction_floating, aVar2.itemView.getContext());
                enj.a(a3, R.id.vkim_add_reaction_floating_smile, e3m.f(R.attr.vk_ui_icon_contrast, view.getContext()));
                return a3;
            default:
                return sqt0.d((sqt0) this.c, (Context) this.d);
        }
    }
}
