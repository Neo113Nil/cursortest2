package xsna;

import android.content.Context;
import android.net.Uri;
import com.vk.attachpicker.stickers.photo.PhotoStickerStyle;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.common.links.LaunchContext;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.dto.user.UserProfile;
import com.vk.im.engine.models.messages.Msg;
import com.vk.libvideo.upload.api.VideoUploadEvent;
import com.vkontakte.android.MainActivity;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import xsna.glu;
import xsna.p810;
import xsna.vm30;
import xsna.z710;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class c2k implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c2k(Context context, Uri uri, LaunchContext launchContext, yp80 yp80Var) {
        this.b = 3;
        this.c = context;
        this.d = uri;
        this.e = yp80Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        boolean z = false;
        int i2 = 1;
        Object obj2 = this.d;
        Object obj3 = this.e;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                io.reactivex.rxjava3.internal.operators.single.v vVar = new io.reactivex.rxjava3.internal.operators.single.v(new tpa(i2, (Context) obj4, (String) obj2));
                asu0 asu0Var = asu0.a;
                io.reactivex.rxjava3.internal.operators.single.b0 m = vVar.q(asu0Var.c()).m(asu0Var.d());
                defpackage.z zVar = new defpackage.z(new f2k(0, (wh50) obj3), 17);
                int i3 = kwg0.a;
                return new i2k(m.subscribe(zVar, new hwg0()));
            case 1:
                y810 y810Var = (y810) obj2;
                f810 f810Var = (f810) obj3;
                UserId userId = ((z710.i) obj4).b;
                ArrayList a = glu.a.a(userId, (List) obj);
                List<glu> list = y810Var.f;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (glu gluVar : list) {
                        if (gluVar.e && epx.f(gluVar.b, userId)) {
                            return f810Var.V().b(0, userId, y810Var.k).l(new zj0(new defpackage.y(14, a, f810Var), 16));
                        }
                    }
                }
                return io.reactivex.rxjava3.core.x.k(new p810.r(a));
            case 2:
                Msg msg = (Msg) obj2;
                vm30.n nVar = (vm30.n) obj3;
                Integer num = (Integer) obj;
                ym30 ym30Var = ((vm30) obj4).t0;
                if (ym30Var != null) {
                    ym30Var.k0(msg, num);
                }
                nVar.invoke();
                return s3q0.a;
            case 3:
                xwk.d().getBrowser().d((Context) obj4, (Uri) obj2, true);
                ((yp80) obj3).onSuccess();
                return s3q0.a;
            case 4:
                MainActivity mainActivity = (MainActivity) obj4;
                p5j0 p5j0Var = (p5j0) obj2;
                mb8 mb8Var = (mb8) obj3;
                if (!((Boolean) obj).booleanValue()) {
                    int i4 = io.reactivex.rxjava3.core.g.b;
                    return io.reactivex.rxjava3.internal.operators.flowable.p.c;
                }
                jyo0 jyo0Var = g5j0.b;
                io.reactivex.rxjava3.core.g<s3q0> a2 = g5j0.b.a(mainActivity, p5j0Var.a);
                asu0 asu0Var2 = asu0.a;
                return new io.reactivex.rxjava3.internal.operators.flowable.r(a2.j(asu0Var2.c()), new x34(new o440(mb8Var, 24), 29)).j(asu0Var2.d());
            case 5:
                ((f8m0) obj4).i((lba0) obj2, (PhotoStickerStyle) ((List) obj3).get(((Integer) obj).intValue()), true);
                return s3q0.a;
            case 6:
                fmq0 fmq0Var = (fmq0) obj4;
                ExtendedUserProfile extendedUserProfile = (ExtendedUserProfile) obj3;
                VKList<Photo> vKList = (VKList) obj;
                Iterator<Photo> it = vKList.iterator();
                while (true) {
                    UserProfile userProfile = null;
                    if (!it.hasNext()) {
                        fmq0Var.a = vKList;
                        throw null;
                    }
                    Photo next = it.next();
                    if (extendedUserProfile != null) {
                        userProfile = bwd0.l(extendedUserProfile);
                    }
                    next.B = userProfile;
                }
            default:
                dks0 dks0Var = (dks0) obj4;
                List list2 = (List) obj3;
                UIBlockList uIBlockList = (UIBlockList) obj;
                if (dks0.b(uIBlockList, (String) obj2)) {
                    dks0Var.d.getClass();
                    Set C = rli0.C(new ulp0(rli0.j(new i5g(uIBlockList.y), inb.d), new fyi0(9)));
                    List list3 = list2;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj5 : list3) {
                        VideoUploadEvent videoUploadEvent = (VideoUploadEvent) obj5;
                        if ((videoUploadEvent instanceof VideoUploadEvent.Start) || (videoUploadEvent instanceof VideoUploadEvent.Progress) || (videoUploadEvent instanceof VideoUploadEvent.Fail)) {
                            arrayList.add(obj5);
                        }
                    }
                    Set S0 = j5g.S0(arrayList);
                    Set C2 = rli0.C(new ulp0(rli0.j(new i5g(uIBlockList.y), uot0.b), new kdw(28)));
                    Set C3 = rli0.C(new ulp0(rli0.j(new i5g(list3), vot0.b), new cd10(27)));
                    Set C4 = rli0.C(new ulp0(rli0.j(new i5g(list3), zh00.d), new y160(21)));
                    if (!C.containsAll(S0) || !S0.containsAll(C) || !C2.containsAll(C3) || p4g.b(C2, C4)) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ c2k(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
