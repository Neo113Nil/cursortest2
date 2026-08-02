package xsna;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.tips.Tooltip;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.ImBgSyncState;
import com.vk.im.engine.models.LongPollType;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.im.engine.models.dialogs.DialogsFilter;
import com.vk.im.ui.views.avatars.AvatarView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.e3m;

/* compiled from: VkDialogsHeaderComponent.kt */
/* loaded from: classes2.dex */
public final class equ0 extends j8i {
    public final a1w i;
    public final mxv j;
    public final Toolbar k;
    public xqm l;
    public Context m;
    public gqu0 n;
    public yqm o;
    public final bpn0 p = new bpn0(new ufu0(this, 3));
    public final Handler q = new Handler(Looper.getMainLooper());
    public final szv r;

    /* compiled from: VkDialogsHeaderComponent.kt */
    public final class a {
        public a() {
        }
    }

    /* compiled from: VkDialogsHeaderComponent.kt */
    public final class b {
        public b() {
        }
    }

    /* compiled from: VkDialogsHeaderComponent.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<Collection<? extends Contact>, s3q0> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.izs
        public final s3q0 invoke(Collection<? extends Contact> collection) {
            Object next;
            Object obj;
            Collection<? extends Contact> collection2 = collection;
            equ0 equ0Var = (equ0) this.receiver;
            equ0Var.getClass();
            if (!collection2.isEmpty() && equ0Var.i.r().n0) {
                cew.b.getClass();
                long j = cew.h().getLong("cfg_new_contacts_hint_import_time_threshold", 0L);
                Collection<? extends Contact> collection3 = collection2;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : collection3) {
                    if (((Contact) obj2).l > j) {
                        arrayList.add(obj2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    Iterator<T> it = collection3.iterator();
                    if (it.hasNext()) {
                        next = it.next();
                        if (it.hasNext()) {
                            long j2 = ((Contact) next).l;
                            do {
                                Object next2 = it.next();
                                long j3 = ((Contact) next2).l;
                                if (j2 < j3) {
                                    next = next2;
                                    j2 = j3;
                                }
                            } while (it.hasNext());
                        }
                    } else {
                        next = null;
                    }
                    Contact contact = (Contact) next;
                    long longValue = (contact != null ? Long.valueOf(contact.l) : null).longValue();
                    cew.b.getClass();
                    cew.h().edit().putLong("cfg_new_contacts_hint_import_time_threshold", longValue).apply();
                    gqu0 gqu0Var = equ0Var.n;
                    if (gqu0Var == null) {
                        gqu0Var = null;
                    }
                    View view = gqu0Var.i;
                    if (view != null) {
                        o8j o8jVar = (o8j) gqu0Var.j.getValue();
                        Context context = o8jVar.a;
                        o8jVar.f = collection2;
                        p8j p8jVar = o8jVar.g;
                        View view2 = p8jVar.v;
                        TextView textView = p8jVar.u;
                        TextView textView2 = p8jVar.t;
                        AvatarView avatarView = p8jVar.w;
                        if (collection2.size() == 1) {
                            Contact contact2 = (Contact) j5g.X(collection3);
                            textView2.setText(p8jVar.getContext().getString(R.string.vkim_new_contact_hint_title_single));
                            String str = contact2.c;
                            ImageList imageList = contact2.h;
                            textView.setText(str);
                            bwt0.p0(avatarView, imageList.Jb());
                            AvatarView.a aVar = AvatarView.y;
                            avatarView.T0(imageList, null);
                            bwt0.p0(view2, contact2.n);
                        } else {
                            Iterator<T> it2 = collection3.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                obj = it2.next();
                                if (((Contact) obj).h.Jb()) {
                                    break;
                                }
                            }
                            Contact contact3 = (Contact) obj;
                            ImageList imageList2 = contact3 != null ? contact3.h : null;
                            textView2.setText(p8jVar.getContext().getString(R.string.vkim_new_contact_hint_title_many));
                            textView.setText(enj.f(R.plurals.vkim_new_contact_hint_count, collection2.size(), p8jVar.getContext()));
                            bwt0.p0(avatarView, imageList2 != null);
                            AvatarView.a aVar2 = AvatarView.y;
                            avatarView.T0(imageList2, null);
                            bwt0.p0(view2, true);
                        }
                        Rect rect = o8jVar.c;
                        view.getGlobalVisibleRect(rect);
                        RectF rectF = o8jVar.d;
                        rectF.set(rect);
                        com.vk.core.tips.b bVar = o8jVar.e;
                        if (bVar != null) {
                            bVar.b(false);
                        }
                        Tooltip.WindowStyle windowStyle = Tooltip.WindowStyle.FULLSCREEN;
                        e3m.a aVar3 = e3m.a;
                        o8jVar.e = Tooltip.l(new Tooltip(context, "", "", windowStyle, null, null, null, context.getColor(R.color.vk_white), 0, null, 0.99f, null, 0, false, null, !iah0.s(context) ? 2 : 1, false, new x5i(o8jVar, 2), null, null, null, null, null, new qq(o8jVar, 7), null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, 0, null, null, null, null, -8553616, 15), o8jVar.a, rectF, false, false, false, false, 236);
                    }
                }
            }
            return s3q0.a;
        }
    }

    public equ0(a1w a1wVar, mxv mxvVar, Toolbar toolbar) {
        this.i = a1wVar;
        this.j = mxvVar;
        this.k = toolbar;
        mxvVar.getClass();
        this.r = k9u0.a;
    }

    @Override // xsna.j8i
    public final void K0(Configuration configuration) {
        this.q.post(new p31(this, 23));
    }

    @Override // xsna.j8i
    public final View L0(LayoutInflater layoutInflater, ViewGroup viewGroup, ViewStub viewStub, Bundle bundle) {
        this.m = layoutInflater.getContext();
        this.j.getClass();
        gqu0 gqu0Var = new gqu0(layoutInflater, this.k, n0v0.a);
        this.n = gqu0Var;
        gqu0Var.d = new b();
        a1w a1wVar = this.i;
        yqm yqmVar = new yqm(a1wVar, this, gqu0Var);
        this.o = yqmVar;
        ImBgSyncState a2 = a1wVar.p().a(LongPollType.MESSAGES);
        yqmVar.e = a2;
        yqmVar.f.a(com.vk.im.engine.reporters.syncstate.b.a(a2));
        yqmVar.a();
        I0(a1wVar.l.a().a0(asu0.a.d()).subscribe(new aas0(new rzl0(this, 23), 5)));
        gqu0 gqu0Var2 = this.n;
        if (gqu0Var2 == null) {
            gqu0Var2 = null;
        }
        return gqu0Var2.b;
    }

    @Override // xsna.j8i
    public final void N0() {
        gqu0 gqu0Var = this.n;
        if (gqu0Var == null) {
            gqu0Var = null;
        }
        gqu0Var.d = null;
    }

    @Override // xsna.j8i
    public final void Q0() {
        this.q.post(new qd0(this, 18));
    }

    public final void X0() {
        if (this.e) {
            ksg0 ksg0Var = new ksg0(this, 24);
            ouu ouuVar = new ouu();
            onm0 onm0Var = new onm0(ksg0Var, 10);
            int i = kwg0.a;
            I0(this.i.E(this, ouuVar).subscribe(onm0Var, new hwg0()));
        }
    }

    public final void Y0() {
        yqm yqmVar = this.o;
        if (yqmVar == null) {
            yqmVar = null;
        }
        yqmVar.b();
    }

    public final void Z0(xqm xqmVar) {
        this.l = xqmVar;
    }

    public final void a1(DialogsFilter dialogsFilter) {
        yqm yqmVar = this.o;
        if (yqmVar == null) {
            yqmVar = null;
        }
        yqmVar.c.b(dialogsFilter);
    }
}
