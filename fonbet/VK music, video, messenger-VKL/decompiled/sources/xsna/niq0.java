package xsna;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import com.vk.api.generated.photos.dto.PhotosImageDto;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.dto.user.UserProfile;
import com.vk.profile.user.impl.domain.edit.models.ExternalEvent;
import com.vk.profile.user.impl.domain.edit.models.ProfileSettingType;
import com.vk.stat.scheme.MobileOfficialAppsProfileStat$CoverEvent;
import com.vk.stat.scheme.MobileOfficialAppsProfileStat$EditProfileEvent;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.aiq0;
import xsna.e4s;
import xsna.fzd0;
import xsna.hr5;
import xsna.ir5;
import xsna.lw50;
import xsna.nyd0;
import xsna.o2k;
import xsna.pta;
import xsna.wiq0;
import xsna.xiq0;
import xsna.yiq0;

/* compiled from: UserEditProfileFeature.kt */
/* loaded from: classes5.dex */
public final class niq0 extends wk50<zjq0, yjq0, aiq0, wiq0> {
    public final liq0 A;
    public final f4z<ExternalEvent> B;
    public final ouq0 f;
    public final fzd0 g;
    public final b4s h;
    public final f4s i;
    public final dvq0 j;
    public final b25 k;
    public final lyd0 l;
    public mp5 m;
    public yzj n;
    public p1m o;
    public id8 p;
    public d270 q;
    public b270 r;
    public e78 s;
    public lw50 t;
    public x3s u;
    public enj0 v;
    public sra w;
    public mta x;
    public pta y;
    public final a z;

    /* compiled from: UserEditProfileFeature.kt */
    public static final /* synthetic */ class a implements yp90, g0t {
        public a() {
        }

        @Override // xsna.yp90
        public final void a(wiq0 wiq0Var) {
            niq0.this.T(wiq0Var);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof yp90) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, niq0.this, niq0.class, "updateState", "updateState(Lcom/vk/mvi/core/data/MviPatch;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [xsna.liq0] */
    public niq0(ouq0 ouq0Var, fzd0 fzd0Var, b4s b4sVar, f4s f4sVar, dvq0 dvq0Var, b25 b25Var, lyd0 lyd0Var) {
        super(aiq0.h.a.b, new xjq0());
        this.f = ouq0Var;
        this.g = fzd0Var;
        this.h = b4sVar;
        this.i = f4sVar;
        this.j = dvq0Var;
        this.k = b25Var;
        this.l = lyd0Var;
        this.z = new a();
        this.A = new s40() { // from class: xsna.liq0
            @Override // xsna.s40
            public final void e2(kj50 kj50Var) {
                niq0.this.C((aiq0) kj50Var);
            }
        };
        this.B = new f4z<>();
    }

    /* JADX WARN: Removed duplicated region for block: B:188:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01cb  */
    @Override // xsna.wk50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N(yjq0 yjq0Var, aiq0 aiq0Var) {
        ExternalEvent bVar;
        ExternalEvent externalEvent;
        Intent intent;
        String action;
        String str;
        pta ptaVar;
        UserProfile userProfile;
        char c;
        ir5 ir5Var;
        char c2;
        o2k o2kVar;
        char c3;
        pta ptaVar2;
        Object failure;
        String url;
        ir5 ir5Var2;
        akq0 a2;
        yjq0 yjq0Var2 = yjq0Var;
        aiq0 aiq0Var2 = aiq0Var;
        if (aiq0Var2 instanceof aiq0.a) {
            mp5 mp5Var = this.m;
            if (mp5Var != null) {
                mp5Var.k.onNext((aiq0.a) aiq0Var2);
                return;
            }
            return;
        }
        if (aiq0Var2 instanceof aiq0.b) {
            e78 e78Var = this.s;
            if (e78Var != null) {
                pta.b bVar2 = e78Var.d;
                f4z<ExternalEvent> f4zVar = e78Var.e;
                aiq0.b bVar3 = (aiq0.b) aiq0Var2;
                boolean equals = bVar3.equals(aiq0.b.a.b);
                eiq0 eiq0Var = eiq0.b;
                if (equals) {
                    pta ptaVar3 = pta.this;
                    if (epx.f(ptaVar3.c, ptaVar3.b)) {
                        f4zVar.b(new ExternalEvent.a());
                        return;
                    } else {
                        e78Var.e2(eiq0Var);
                        return;
                    }
                }
                if (bVar3.equals(aiq0.b.C2545b.b)) {
                    pta ptaVar4 = pta.this;
                    if (epx.f(ptaVar4.c, ptaVar4.b)) {
                        f4zVar.b(new ExternalEvent.a());
                        return;
                    } else {
                        e78Var.e2(eiq0Var);
                        return;
                    }
                }
                if (!(bVar3 instanceof diq0)) {
                    if (!bVar3.equals(eiq0Var)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    e78Var.b(viq0.b);
                    return;
                } else {
                    boolean z = ((diq0) bVar3).b;
                    e78Var.b(uiq0.b);
                    if (z) {
                        f4zVar.b(new ExternalEvent.a());
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (aiq0Var2 instanceof aiq0.d) {
            sra sraVar = this.w;
            if (sraVar != null) {
                aiq0.d dVar = (aiq0.d) aiq0Var2;
                pta ptaVar5 = sraVar.d;
                if (dVar instanceof aiq0.d.a) {
                    ptaVar5.a(((aiq0.d.a) dVar).b);
                    sraVar.c.a(new wiq0.e(ptaVar5.c));
                    return;
                }
                if (!(dVar instanceof aiq0.d.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                pta.a aVar = ((aiq0.d.b) dVar).b;
                if (aVar instanceof pta.a.C3530a) {
                    a2 = akq0.a(ptaVar5.b, ((pta.a.C3530a) aVar).a, null, null, false, 30);
                } else if (aVar instanceof pta.a.b) {
                    a2 = akq0.a(ptaVar5.b, null, ((pta.a.b) aVar).a, null, false, 29);
                } else if (aVar instanceof pta.a.c) {
                    a2 = akq0.a(ptaVar5.b, null, null, ((pta.a.c) aVar).a, false, 23);
                } else if (aVar instanceof pta.a.e) {
                    a2 = akq0.a(ptaVar5.b, null, null, null, false, 27);
                } else {
                    if (!(aVar instanceof pta.a.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    a2 = akq0.a(ptaVar5.b, null, null, null, ((pta.a.d) aVar).a, 15);
                }
                ptaVar5.b = a2;
                return;
            }
            return;
        }
        boolean z2 = aiq0Var2 instanceof aiq0.e;
        int i = 23;
        int i2 = 16;
        int i3 = 17;
        int i4 = 4;
        o2k o2kVar2 = o2k.a.a;
        boolean z3 = true;
        r11 = null;
        RectF rectF = null;
        int i5 = 0;
        if (z2) {
            yzj yzjVar = this.n;
            if (yzjVar != null) {
                yp90<wiq0> yp90Var = yzjVar.c;
                s40<aiq0> s40Var = yzjVar.b;
                aiq0.e eVar = (aiq0.e) aiq0Var2;
                lyd0 lyd0Var = yzjVar.h;
                if (!eVar.equals(aiq0.e.a.b)) {
                    if (eVar instanceof aiq0.e.b) {
                        Intent intent2 = ((aiq0.e.b) eVar).b;
                        if (intent2 == null) {
                            return;
                        }
                        h1k h1kVar = yzjVar.g;
                        h1kVar.getClass();
                        String stringExtra = intent2.getStringExtra("__cover_url_key__");
                        str = stringExtra != null ? stringExtra : "";
                        RectF rectF2 = (RectF) intent2.getParcelableExtra("__cover_rect_key__");
                        if (rectF2 == null) {
                            rectF2 = new RectF();
                        }
                        Uri parse = Uri.parse(str);
                        yzjVar.e.b(mcr0.h(parse).U(new w7(new dsc(parse, i3), i2)).L(new y7(new o43(15, rectF2, h1kVar), 12), false).U(new v20(new sf4(7, rectF2, str), 18)).subscribe(new ea(new t6(yzjVar, 28), i), new el6(new srg(yzjVar, i4), 14)));
                        return;
                    }
                    boolean equals2 = eVar.equals(aiq0.e.c.b);
                    giq0 giq0Var = giq0.b;
                    if (equals2) {
                        s40Var.e2(giq0Var);
                        nyd0.d f = lyd0Var.f();
                        f.getClass();
                        nyd0.d.a(f, MobileOfficialAppsProfileStat$CoverEvent.CoverEventType.DELETE_COVER);
                        return;
                    }
                    if (eVar instanceof fiq0) {
                        if (((fiq0) eVar).b) {
                            s40Var.e2(new aiq0.d.a(new pta.a.b(o2kVar2)));
                        }
                        yp90Var.a(xiq0.a.b);
                        return;
                    } else {
                        if (!eVar.equals(giq0Var)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        yp90Var.a(xiq0.b.b);
                        return;
                    }
                }
                lyd0Var.j().a();
                pta ptaVar6 = yzjVar.d;
                ir5 ir5Var3 = ptaVar6.c.a;
                if (!(ir5Var3 instanceof ir5.a)) {
                    if (ir5Var3 instanceof ir5.b) {
                        url = ((ir5.b) ir5Var3).b.b.a;
                    } else {
                        if (!(ir5Var3 instanceof ir5.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        hr5 hr5Var = ((ir5.c) ir5Var3).a;
                        if (hr5Var instanceof hr5.a) {
                            ImageSize Cb = ((hr5.a) hr5Var).a.Cb(iah0.a(100), true, false);
                            if (Cb != null) {
                                url = Cb.d.d;
                            }
                        } else {
                            if (!(hr5Var instanceof hr5.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            PhotosImageDto C = ((hr5.b) hr5Var).c.C();
                            if (C != null) {
                                url = C.getUrl();
                            }
                        }
                    }
                    ir5Var2 = ptaVar6.c.a;
                    if (!(ir5Var2 instanceof ir5.b)) {
                        fzd0.b bVar4 = ((ir5.b) ir5Var2).b.b;
                        rectF = new RectF(bVar4.d, bVar4.e, bVar4.f, bVar4.g);
                    } else if (ir5Var2 instanceof ir5.c) {
                        hr5 hr5Var2 = ((ir5.c) ir5Var2).a;
                        if (hr5Var2 instanceof hr5.b) {
                            rectF = ((hr5.b) hr5Var2).b;
                        }
                    }
                    s40Var.e2(new aiq0.i.c(rectF, url));
                    return;
                }
                url = null;
                ir5Var2 = ptaVar6.c.a;
                if (!(ir5Var2 instanceof ir5.b)) {
                }
                s40Var.e2(new aiq0.i.c(rectF, url));
                return;
            }
            return;
        }
        if (aiq0Var2 instanceof aiq0.f) {
            p1m p1mVar = this.o;
            if (p1mVar != null) {
                p1mVar.b.e2(new aiq0.d.a(new pta.a.c(((aiq0.f) aiq0Var2).b)));
                return;
            }
            return;
        }
        boolean z4 = aiq0Var2 instanceof aiq0.h;
        int i6 = 8;
        int i7 = 6;
        ouq0 ouq0Var = this.f;
        if (!z4) {
            if (aiq0Var2 instanceof aiq0.c) {
                id8 id8Var = this.p;
                if (id8Var == null || (action = (intent = ((aiq0.c) aiq0Var2).b).getAction()) == null) {
                    return;
                }
                boolean equals3 = action.equals("com.vkontakte.android.USER_PHOTO_CHANGED");
                Bundle extras = intent.getExtras();
                String string = extras != null ? extras.getString("ava_photo_id") : null;
                str = string != null ? string : "";
                boolean equals4 = action.equals("com.vkontakte.android.USER_COVER_CHANGED");
                if (action.equals("com.vkontakte.android.ACTION_PROFILE_UPDATED") || ((equals3 && !intent.hasExtra("image")) || (equals4 && !intent.hasExtra("photo")))) {
                    id8Var.a();
                    return;
                }
                if (equals3) {
                    id8Var.f.k().e(str);
                    Image image = (Image) intent.getParcelableExtra("image");
                    if (image == null || image.b.isEmpty()) {
                        id8Var.a();
                        return;
                    } else {
                        id8Var.c(image);
                        return;
                    }
                }
                if (equals4) {
                    Photo photo = (Photo) intent.getParcelableExtra("photo");
                    if (photo == null || photo.y.b.isEmpty()) {
                        id8Var.a();
                        return;
                    } else {
                        id8Var.d(photo, null);
                        return;
                    }
                }
                return;
            }
            if (aiq0Var2 instanceof aiq0.i) {
                lw50 lw50Var = this.t;
                if (lw50Var != null) {
                    aiq0.i iVar = (aiq0.i) aiq0Var2;
                    lyd0 lyd0Var2 = lw50Var.b;
                    if (iVar instanceof aiq0.i.a) {
                        nyd0.e g = lyd0Var2.g();
                        g.getClass();
                        nyd0.e.b(g, MobileOfficialAppsProfileStat$EditProfileEvent.EditProfileEvent.CLICK_TO_NAME_CHANGE, null, null, 6);
                        externalEvent = new ExternalEvent.b.a();
                    } else {
                        if (iVar instanceof aiq0.i.b) {
                            bVar = new ExternalEvent.b.C1672b(((aiq0.i.b) iVar).b);
                        } else if (iVar instanceof aiq0.i.f) {
                            ProfileSettingType profileSettingType = ((aiq0.i.f) iVar).b;
                            switch (lw50.a.$EnumSwitchMapping$0[profileSettingType.ordinal()]) {
                                case 1:
                                    lyd0Var2.g().a(MobileOfficialAppsProfileStat$EditProfileEvent.ChangedParameter.MAIN);
                                    break;
                                case 2:
                                    lyd0Var2.g().a(MobileOfficialAppsProfileStat$EditProfileEvent.ChangedParameter.CONTACTS);
                                    break;
                                case 3:
                                    lyd0Var2.g().a(MobileOfficialAppsProfileStat$EditProfileEvent.ChangedParameter.INTERESTS);
                                    break;
                                case 4:
                                    lyd0Var2.g().a(MobileOfficialAppsProfileStat$EditProfileEvent.ChangedParameter.EDUCATION);
                                    break;
                                case 5:
                                    lyd0Var2.g().a(MobileOfficialAppsProfileStat$EditProfileEvent.ChangedParameter.CAREER);
                                    break;
                                case 6:
                                    lyd0Var2.g().a(MobileOfficialAppsProfileStat$EditProfileEvent.ChangedParameter.PERSONAL);
                                    break;
                                case 7:
                                    lyd0Var2.g().a(MobileOfficialAppsProfileStat$EditProfileEvent.ChangedParameter.MILITARY);
                                    break;
                                case 8:
                                    lyd0Var2.g().a(MobileOfficialAppsProfileStat$EditProfileEvent.ChangedParameter.ACCOUNT);
                                    break;
                                case 9:
                                    lyd0Var2.g().a(MobileOfficialAppsProfileStat$EditProfileEvent.ChangedParameter.SECURITY);
                                    break;
                                default:
                                    throw new NoWhenBranchMatchedException();
                            }
                            bVar = new ExternalEvent.b.e(profileSettingType);
                        } else if (iVar instanceof aiq0.i.c) {
                            aiq0.i.c cVar = (aiq0.i.c) iVar;
                            bVar = new ExternalEvent.b.c(cVar.c, cVar.b);
                        } else if (iVar instanceof aiq0.i.e) {
                            nyd0.e g2 = lyd0Var2.g();
                            g2.getClass();
                            nyd0.e.b(g2, MobileOfficialAppsProfileStat$EditProfileEvent.EditProfileEvent.EDIT_NICKNAME, null, null, 6);
                            bVar = new ExternalEvent.b.d(((aiq0.i.e) iVar).b);
                        } else if (iVar instanceof aiq0.i.g) {
                            bVar = new ExternalEvent.b.f(((aiq0.i.g) iVar).b);
                        } else if (iVar instanceof aiq0.i.h) {
                            externalEvent = ExternalEvent.b.g.a;
                        } else {
                            if (!(iVar instanceof aiq0.i.d)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aiq0.i.d dVar2 = (aiq0.i.d) iVar;
                            if (dVar2 instanceof aiq0.i.d.a) {
                                externalEvent = com.vk.profile.user.impl.domain.edit.models.a.a;
                            } else {
                                if (!(dVar2 instanceof aiq0.i.d.b)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aiq0.i.d.b bVar5 = (aiq0.i.d.b) dVar2;
                                bVar = new com.vk.profile.user.impl.domain.edit.models.b(bVar5.b, bVar5.c);
                            }
                        }
                        externalEvent = bVar;
                    }
                    lw50Var.a.b(externalEvent);
                    return;
                }
                return;
            }
            if (aiq0Var2 instanceof aiq0.k) {
                d270 d270Var = this.q;
                if (d270Var != null) {
                    d270Var.b.e2(new aiq0.d.a(new pta.a.e()));
                    return;
                }
                return;
            }
            if (aiq0Var2 instanceof aiq0.j) {
                b270 b270Var = this.r;
                if (b270Var != null) {
                    yp90<wiq0> yp90Var2 = b270Var.c;
                    s40<aiq0> s40Var2 = b270Var.b;
                    aiq0.j jVar = (aiq0.j) aiq0Var2;
                    dvq0 dvq0Var = b270Var.e;
                    ExtendedUserProfile extendedUserProfile = b270Var.f;
                    if (jVar instanceof kiq0) {
                        yp90Var2.a(new yiq0.b(((kiq0) jVar).b));
                        return;
                    }
                    if (jVar instanceof jiq0) {
                        yp90Var2.a(yiq0.a.b);
                        aiq0.j jVar2 = ((jiq0) jVar).b;
                        if (jVar2 != null) {
                            s40Var2.e2(jVar2);
                            return;
                        }
                        return;
                    }
                    if (jVar.equals(aiq0.j.a.b)) {
                        dvq0Var.b(dvq0Var.g(extendedUserProfile));
                        b270Var.d.b(new ExternalEvent.ShowSnackbar(ExternalEvent.ShowSnackbar.ShowType.Window, R.drawable.vk_icon_animated_check_circle_on_24, R.string.user_profile_menu_edit_nickname_copied, iah0.a(8)));
                        return;
                    } else if (jVar.equals(aiq0.j.b.b)) {
                        s40Var2.e2(new aiq0.i.e(extendedUserProfile.A0));
                        return;
                    } else {
                        if (!jVar.equals(aiq0.j.c.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        s40Var2.e2(new aiq0.i.g(dvq0Var.g(extendedUserProfile)));
                        return;
                    }
                }
                return;
            }
            boolean z5 = aiq0Var2 instanceof aiq0.g;
            int i8 = 22;
            a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
            if (!z5) {
                if (aiq0Var2 instanceof aiq0.n) {
                    enj0 enj0Var = this.v;
                    if (enj0Var != null) {
                        enj0Var.b.a(new wiq0.d.a(((aiq0.n) aiq0Var2).b));
                        enj0Var.e.b(new io.reactivex.rxjava3.internal.operators.observable.c0(enj0Var.d.z(), new fs00(new gda0(enj0Var, 17), i8), kVar).G(new zb20(enj0Var, z3 ? 1 : 0)).subscribe(new k130(new e9i0(enj0Var, i7), 19)));
                        return;
                    }
                    return;
                }
                if (aiq0Var2 instanceof aiq0.m) {
                    T(new wiq0.c.a(((aiq0.m) aiq0Var2).b));
                    return;
                }
                if (!(aiq0Var2 instanceof aiq0.l)) {
                    throw new NoWhenBranchMatchedException();
                }
                aiq0.l lVar = (aiq0.l) aiq0Var2;
                if (epx.f(lVar, aiq0.l.a.b)) {
                    ouq0Var.x();
                    T(wiq0.f.a.b);
                    return;
                } else {
                    if (!epx.f(lVar, aiq0.l.b.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ouq0Var.x();
                    T(wiq0.f.a.b);
                    C(new aiq0.a.b("profile_edit_banner"));
                    return;
                }
            }
            x3s x3sVar = this.u;
            if (x3sVar != null) {
                aiq0.g gVar = (aiq0.g) aiq0Var2;
                if (gVar instanceof aiq0.g.b) {
                    aiq0.g.b bVar6 = (aiq0.g.b) gVar;
                    if (!bVar6.b) {
                        x3sVar.e2(new aiq0.d.a(new pta.a.d(false)));
                        return;
                    }
                    if (!yjq0Var2.s) {
                        x3sVar.e2(new aiq0.d.a(new pta.a.d(true)));
                        return;
                    } else if (bVar6.c) {
                        x3sVar.h.b(new io.reactivex.rxjava3.internal.operators.observable.c0(x3sVar.f.A(), new i22(new ozh(x3sVar, i2), i), kVar).G(new oa4(x3sVar, 3)).subscribe(new gf0(new j9k(x3sVar, 13), i8)));
                        return;
                    } else {
                        x3sVar.e2(aiq0.i.d.a.b);
                        return;
                    }
                }
                if (gVar instanceof aiq0.g.a) {
                    e4s.a aVar2 = ((aiq0.g.a) gVar).b;
                    if (aVar2 instanceof e4s.a.b) {
                        x3sVar.e2(aiq0.i.h.b);
                        return;
                    } else {
                        if (!(aVar2 instanceof e4s.a.C2777a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        return;
                    }
                }
                if (gVar instanceof aiq0.g.d) {
                    x3sVar.e2(new aiq0.i.d.b(x3sVar.e.c.e, yjq0Var2.r.b));
                    return;
                } else {
                    if (!(gVar instanceof aiq0.g.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f4s f4sVar = x3sVar.g;
                    Context context = x3sVar.d;
                    f4sVar.getClass();
                    x3sVar.c.a(new wiq0.b.a(f4s.a(context, yjq0Var2.t)));
                    return;
                }
            }
            return;
        }
        aiq0.h hVar = (aiq0.h) aiq0Var2;
        if (hVar instanceof aiq0.h.a) {
            T(ejq0.b);
            this.t = null;
            this.m = null;
            this.n = null;
            this.p = null;
            this.o = null;
            this.q = null;
            this.s = null;
            this.w = null;
            this.x = null;
            this.y = null;
            this.u = null;
            this.v = null;
            this.y = new pta(akq0.f);
            this.e.b(new io.reactivex.rxjava3.internal.operators.observable.o1(ouq0Var.o(false), new qca0(new xd40(this, 27), i6)).subscribe(new miq0(new j6l0(this, 11), i5), new j3z(new xvl0(this, i6), 21)));
            return;
        }
        boolean z6 = hVar instanceof hiq0;
        lyd0 lyd0Var3 = this.l;
        f4z<ExternalEvent> f4zVar2 = this.B;
        if (!z6) {
            int i9 = 3;
            if (!epx.f(hVar, aiq0.h.b.b)) {
                if (!(hVar instanceof iiq0)) {
                    throw new NoWhenBranchMatchedException();
                }
                T(new gjq0(((iiq0) hVar).b));
                return;
            }
            nyd0.e g3 = lyd0Var3.g();
            g3.getClass();
            nyd0.e.b(g3, MobileOfficialAppsProfileStat$EditProfileEvent.EditProfileEvent.SAVE_PROFILE, null, null, 6);
            this.p = null;
            T(fjq0.b);
            ExtendedUserProfile extendedUserProfile2 = yjq0Var2.p;
            UserId userId = (extendedUserProfile2 == null || (userProfile = extendedUserProfile2.a) == null) ? null : userProfile.c;
            if (userId != null && this.j.a(userId) && (ptaVar = this.y) != null) {
                pta ptaVar7 = pta.this;
                if (!epx.f(ptaVar7.c, ptaVar7.b)) {
                    pta ptaVar8 = this.y;
                    if (ptaVar8 != null && ptaVar8.a.a()) {
                        nyd0.e g4 = lyd0Var3.g();
                        String str2 = yjq0Var2.j;
                        g4.getClass();
                        nyd0.e.b(g4, MobileOfficialAppsProfileStat$EditProfileEvent.EditProfileEvent.EDIT_SHORT_INFO, null, str2, 2);
                    }
                    mta mtaVar = this.x;
                    if (mtaVar != null) {
                        lta[] ltaVarArr = mtaVar.a;
                        ArrayList arrayList = new ArrayList(5);
                        for (int i10 = 0; i10 < 5; i10++) {
                            arrayList.add(ltaVarArr[i10].apply());
                        }
                        io.reactivex.rxjava3.internal.operators.single.i iVar2 = new io.reactivex.rxjava3.internal.operators.single.i(new io.reactivex.rxjava3.internal.operators.single.r(arrayList.isEmpty() ? io.reactivex.rxjava3.core.x.k(EmptyList.b) : io.reactivex.rxjava3.core.x.D(arrayList, new tr(new zsw(20), 24)), new mlh0(new zyl0(this, 9), i4)), new axb(this, i9));
                        int i11 = kwg0.a;
                        iVar2.subscribe(new iwg0(), new hwg0());
                        return;
                    }
                    return;
                }
            }
            f4zVar2.b(new ExternalEvent.a());
            return;
        }
        ExtendedUserProfile extendedUserProfile3 = ((hiq0) hVar).b;
        Image image2 = extendedUserProfile3.a.O;
        if (!extendedUserProfile3.n0) {
            image2 = null;
        }
        if (image2 != null) {
            c = 3;
            ir5Var = new ir5.c(new hr5.a(image2));
        } else {
            c = 3;
            ir5Var = null;
        }
        Photo photo2 = extendedUserProfile3.A;
        if (!extendedUserProfile3.e()) {
            photo2 = null;
        }
        o2k bVar7 = photo2 != null ? new o2k.c.b(new hea0(photo2)) : null;
        String str3 = extendedUserProfile3.n;
        if (str3 != null) {
            if (!extendedUserProfile3.e()) {
                str3 = null;
            }
            if (str3 != null) {
                char c4 = 4;
                try {
                    failure = Integer.valueOf(Color.parseColor("#FF".concat(drm0.U(str3, "#"))));
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                boolean z7 = failure instanceof Result.Failure;
                Object obj = failure;
                if (z7) {
                    obj = null;
                }
                Integer num = (Integer) obj;
                c2 = c4;
                if (num != null) {
                    o2kVar = new o2k.c.a(num.intValue());
                    c3 = c4;
                    boolean z8 = extendedUserProfile3.B0;
                    String str4 = extendedUserProfile3.g1;
                    if (ir5Var == null) {
                        ir5Var = new ir5.a(0);
                    }
                    pta ptaVar9 = new pta(new akq0(ir5Var, bVar7 != null ? bVar7 : o2kVar != null ? o2kVar : o2kVar2, z8, str4, extendedUserProfile3.Q1));
                    ptaVar2 = this.y;
                    if (ptaVar2 != null) {
                        pta ptaVar10 = pta.this;
                        if (ptaVar10.c.e != ptaVar10.b.e) {
                            ptaVar9.a(new pta.a.d(ptaVar2.c.e));
                        }
                    }
                    this.y = ptaVar9;
                    this.t = new lw50(f4zVar2, lyd0Var3);
                    io.reactivex.rxjava3.disposables.b bVar8 = this.e;
                    liq0 liq0Var = this.A;
                    a aVar3 = this.z;
                    this.m = new mp5(ptaVar9, extendedUserProfile3, bVar8, lyd0Var3, liq0Var, aVar3);
                    ouq0 ouq0Var2 = this.f;
                    io.reactivex.rxjava3.disposables.b bVar9 = this.e;
                    lyd0 lyd0Var4 = this.l;
                    this.p = new id8(ptaVar9, ouq0Var2, bVar9, lyd0Var4, liq0Var);
                    this.n = new yzj(ptaVar9, bVar9, this.B, lyd0Var4, liq0Var, aVar3);
                    this.o = new p1m(liq0Var, aVar3);
                    this.q = new d270(liq0Var);
                    f4z<ExternalEvent> f4zVar3 = this.B;
                    dvq0 dvq0Var2 = this.j;
                    this.r = new b270(liq0Var, aVar3, f4zVar3, dvq0Var2, extendedUserProfile3);
                    this.s = new e78(ptaVar9.a, f4zVar3, liq0Var, aVar3);
                    this.w = new sra(ptaVar9, aVar3, liq0Var);
                    Context context2 = e43.a;
                    Context context3 = context2 != null ? context2 : null;
                    ouq0 ouq0Var3 = this.f;
                    f4s f4sVar2 = this.i;
                    io.reactivex.rxjava3.disposables.b bVar10 = this.e;
                    this.u = new x3s(context3, ptaVar9, ouq0Var3, f4sVar2, bVar10, liq0Var, aVar3);
                    this.v = new enj0(ouq0Var3, bVar10, aVar3, liq0Var);
                    kq5 kq5Var = new kq5(ptaVar9, this.g, dvq0Var2, ouq0Var3);
                    e0k e0kVar = new e0k(ptaVar9);
                    u1m u1mVar = new u1m(ptaVar9, this.k);
                    e270 e270Var = new e270(ptaVar9);
                    z3s z3sVar = new z3s(ptaVar9, this.h, ouq0Var3);
                    lta[] ltaVarArr2 = new lta[5];
                    ltaVarArr2[0] = kq5Var;
                    ltaVarArr2[1] = e0kVar;
                    ltaVarArr2[2] = u1mVar;
                    ltaVarArr2[c] = e270Var;
                    ltaVarArr2[c3] = z3sVar;
                    this.x = new mta(ltaVarArr2);
                    Context context4 = e43.a;
                    Context context5 = context4 != null ? context4 : null;
                    this.i.getClass();
                    T(new bjq0(extendedUserProfile3, ptaVar9.c, f4s.a(context5, extendedUserProfile3.C1 > 0), ouq0Var.i(extendedUserProfile3)));
                }
                o2kVar = null;
                c3 = c2;
                boolean z82 = extendedUserProfile3.B0;
                String str42 = extendedUserProfile3.g1;
                if (ir5Var == null) {
                }
                pta ptaVar92 = new pta(new akq0(ir5Var, bVar7 != null ? bVar7 : o2kVar != null ? o2kVar : o2kVar2, z82, str42, extendedUserProfile3.Q1));
                ptaVar2 = this.y;
                if (ptaVar2 != null) {
                }
                this.y = ptaVar92;
                this.t = new lw50(f4zVar2, lyd0Var3);
                io.reactivex.rxjava3.disposables.b bVar82 = this.e;
                liq0 liq0Var2 = this.A;
                a aVar32 = this.z;
                this.m = new mp5(ptaVar92, extendedUserProfile3, bVar82, lyd0Var3, liq0Var2, aVar32);
                ouq0 ouq0Var22 = this.f;
                io.reactivex.rxjava3.disposables.b bVar92 = this.e;
                lyd0 lyd0Var42 = this.l;
                this.p = new id8(ptaVar92, ouq0Var22, bVar92, lyd0Var42, liq0Var2);
                this.n = new yzj(ptaVar92, bVar92, this.B, lyd0Var42, liq0Var2, aVar32);
                this.o = new p1m(liq0Var2, aVar32);
                this.q = new d270(liq0Var2);
                f4z<ExternalEvent> f4zVar32 = this.B;
                dvq0 dvq0Var22 = this.j;
                this.r = new b270(liq0Var2, aVar32, f4zVar32, dvq0Var22, extendedUserProfile3);
                this.s = new e78(ptaVar92.a, f4zVar32, liq0Var2, aVar32);
                this.w = new sra(ptaVar92, aVar32, liq0Var2);
                Context context22 = e43.a;
                if (context22 != null) {
                }
                ouq0 ouq0Var32 = this.f;
                f4s f4sVar22 = this.i;
                io.reactivex.rxjava3.disposables.b bVar102 = this.e;
                this.u = new x3s(context3, ptaVar92, ouq0Var32, f4sVar22, bVar102, liq0Var2, aVar32);
                this.v = new enj0(ouq0Var32, bVar102, aVar32, liq0Var2);
                kq5 kq5Var2 = new kq5(ptaVar92, this.g, dvq0Var22, ouq0Var32);
                e0k e0kVar2 = new e0k(ptaVar92);
                u1m u1mVar2 = new u1m(ptaVar92, this.k);
                e270 e270Var2 = new e270(ptaVar92);
                z3s z3sVar2 = new z3s(ptaVar92, this.h, ouq0Var32);
                lta[] ltaVarArr22 = new lta[5];
                ltaVarArr22[0] = kq5Var2;
                ltaVarArr22[1] = e0kVar2;
                ltaVarArr22[2] = u1mVar2;
                ltaVarArr22[c] = e270Var2;
                ltaVarArr22[c3] = z3sVar2;
                this.x = new mta(ltaVarArr22);
                Context context42 = e43.a;
                if (context42 != null) {
                }
                this.i.getClass();
                T(new bjq0(extendedUserProfile3, ptaVar92.c, f4s.a(context5, extendedUserProfile3.C1 > 0), ouq0Var.i(extendedUserProfile3)));
            }
        }
        c2 = 4;
        o2kVar = null;
        c3 = c2;
        boolean z822 = extendedUserProfile3.B0;
        String str422 = extendedUserProfile3.g1;
        if (ir5Var == null) {
        }
        pta ptaVar922 = new pta(new akq0(ir5Var, bVar7 != null ? bVar7 : o2kVar != null ? o2kVar : o2kVar2, z822, str422, extendedUserProfile3.Q1));
        ptaVar2 = this.y;
        if (ptaVar2 != null) {
        }
        this.y = ptaVar922;
        this.t = new lw50(f4zVar2, lyd0Var3);
        io.reactivex.rxjava3.disposables.b bVar822 = this.e;
        liq0 liq0Var22 = this.A;
        a aVar322 = this.z;
        this.m = new mp5(ptaVar922, extendedUserProfile3, bVar822, lyd0Var3, liq0Var22, aVar322);
        ouq0 ouq0Var222 = this.f;
        io.reactivex.rxjava3.disposables.b bVar922 = this.e;
        lyd0 lyd0Var422 = this.l;
        this.p = new id8(ptaVar922, ouq0Var222, bVar922, lyd0Var422, liq0Var22);
        this.n = new yzj(ptaVar922, bVar922, this.B, lyd0Var422, liq0Var22, aVar322);
        this.o = new p1m(liq0Var22, aVar322);
        this.q = new d270(liq0Var22);
        f4z<ExternalEvent> f4zVar322 = this.B;
        dvq0 dvq0Var222 = this.j;
        this.r = new b270(liq0Var22, aVar322, f4zVar322, dvq0Var222, extendedUserProfile3);
        this.s = new e78(ptaVar922.a, f4zVar322, liq0Var22, aVar322);
        this.w = new sra(ptaVar922, aVar322, liq0Var22);
        Context context222 = e43.a;
        if (context222 != null) {
        }
        ouq0 ouq0Var322 = this.f;
        f4s f4sVar222 = this.i;
        io.reactivex.rxjava3.disposables.b bVar1022 = this.e;
        this.u = new x3s(context3, ptaVar922, ouq0Var322, f4sVar222, bVar1022, liq0Var22, aVar322);
        this.v = new enj0(ouq0Var322, bVar1022, aVar322, liq0Var22);
        kq5 kq5Var22 = new kq5(ptaVar922, this.g, dvq0Var222, ouq0Var322);
        e0k e0kVar22 = new e0k(ptaVar922);
        u1m u1mVar22 = new u1m(ptaVar922, this.k);
        e270 e270Var22 = new e270(ptaVar922);
        z3s z3sVar22 = new z3s(ptaVar922, this.h, ouq0Var322);
        lta[] ltaVarArr222 = new lta[5];
        ltaVarArr222[0] = kq5Var22;
        ltaVarArr222[1] = e0kVar22;
        ltaVarArr222[2] = u1mVar22;
        ltaVarArr222[c] = e270Var22;
        ltaVarArr222[c3] = z3sVar22;
        this.x = new mta(ltaVarArr222);
        Context context422 = e43.a;
        if (context422 != null) {
        }
        this.i.getClass();
        T(new bjq0(extendedUserProfile3, ptaVar922.c, f4s.a(context5, extendedUserProfile3.C1 > 0), ouq0Var.i(extendedUserProfile3)));
    }
}
