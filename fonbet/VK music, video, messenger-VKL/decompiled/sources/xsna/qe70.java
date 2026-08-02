package xsna;

import android.content.Context;
import com.facebook.soloader.MinElf;
import com.google.gson.Gson;
import com.vk.api.generated.base.dto.BaseUserGroupFieldsDto;
import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.api.generated.groups.dto.GroupsFilterDto;
import com.vk.api.generated.notifications.dto.NotificationsEditRedesignPushSettingValueDto;
import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingOptionsDto;
import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingOptionsItemDto;
import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingPushSettingDto;
import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingRedesignDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.internal.api.GsonHolder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.cf70;
import xsna.if70;
import xsna.le70;
import xsna.o0r0;
import xsna.vzi0;

/* compiled from: NotificationSettingFeature.kt */
/* loaded from: classes5.dex */
public final class qe70 extends wk50<nf70, jf70, le70, cf70> {
    public final p870 f;
    public final anm0 g;
    public final pax0 h;
    public final s101 i;
    public final avl0 j;
    public final max0 k;
    public final zqu l;
    public final Gson m;
    public final f4z n;
    public final f4z o;

    public qe70(p870 p870Var, anm0 anm0Var, pax0 pax0Var, String str, String str2, NotificationsNotificationSettingRedesignDto notificationsNotificationSettingRedesignDto) {
        super(new le70.c(str, str2, notificationsNotificationSettingRedesignDto), new gf70(new jf70(0)));
        this.f = p870Var;
        this.g = anm0Var;
        this.h = pax0Var;
        this.i = new s101();
        this.j = new avl0();
        this.k = new max0();
        this.l = new zqu();
        this.m = GsonHolder.a();
        this.n = new f4z();
        this.o = new f4z();
    }

    @Override // xsna.wk50
    public final void N(jf70 jf70Var, le70 le70Var) {
        jf70 jf70Var2 = jf70Var;
        le70 le70Var2 = le70Var;
        NotificationsNotificationSettingRedesignDto notificationsNotificationSettingRedesignDto = jf70Var2.e;
        String str = jf70Var2.d;
        boolean z = le70Var2 instanceof le70.a;
        s101 s101Var = this.i;
        io.reactivex.rxjava3.disposables.b bVar = this.e;
        vzi0.d dVar = vzi0.d.a;
        f4z f4zVar = this.o;
        if (z) {
            NotificationsNotificationSettingOptionsItemDto notificationsNotificationSettingOptionsItemDto = ((le70.a) le70Var2).b;
            if (str == null) {
                return;
            }
            f4zVar.b(dVar);
            Context context = e43.a;
            String d = b6m.d(context != null ? context : null);
            String id = notificationsNotificationSettingOptionsItemDto.getId();
            bVar.b(rsg0.T(yfb.x(s101Var.z(d, str, id != null ? id : ""))).subscribe(new tk40(new jh3(this, jf70Var2, notificationsNotificationSettingOptionsItemDto, 8), 6), new m5y(new b140(this, 6), 12)));
            return;
        }
        if (le70Var2 instanceof le70.b) {
            NotificationsNotificationSettingOptionsItemDto notificationsNotificationSettingOptionsItemDto2 = ((le70.b) le70Var2).b;
            if (str == null) {
                return;
            }
            r12 = (notificationsNotificationSettingRedesignDto != null ? notificationsNotificationSettingRedesignDto.f() : null) == NotificationsNotificationSettingPushSettingDto.OFF;
            f4zVar.b(dVar);
            Context context2 = e43.a;
            String d2 = b6m.d(context2 != null ? context2 : null);
            String id2 = notificationsNotificationSettingOptionsItemDto2.getId();
            bVar.b(rsg0.T(yfb.x(s101Var.z(d2, str, id2 != null ? id2 : ""))).subscribe(new ff3(new uw9(r12, this, jf70Var2, 2), 28), new cc20(new or50(this, 4), 9)));
            return;
        }
        boolean z2 = le70Var2 instanceof le70.c;
        cf70.b bVar2 = cf70.b.b;
        if (z2) {
            le70.c cVar = (le70.c) le70Var2;
            String str2 = cVar.b;
            if (str2 == null) {
                T(bVar2);
                return;
            } else {
                T(new cf70.d(str2, cVar.c, cVar.d));
                X(str2);
                return;
            }
        }
        if (le70Var2.equals(le70.d.b)) {
            this.n.b(if70.a.a);
            return;
        }
        if (le70Var2.equals(le70.k.b)) {
            U(jf70Var2, null);
            return;
        }
        if (le70Var2.equals(le70.l.b)) {
            if (str != null) {
                if ((notificationsNotificationSettingRedesignDto != null ? notificationsNotificationSettingRedesignDto.f() : null) == null) {
                    return;
                }
                r12 = notificationsNotificationSettingRedesignDto.f() == NotificationsNotificationSettingPushSettingDto.NO_SOUND;
                f4zVar.b(dVar);
                Context context3 = e43.a;
                bVar.b(rsg0.T(yfb.x(s101Var.y(b6m.d(context3 != null ? context3 : null), str, r12 ? NotificationsEditRedesignPushSettingValueDto.ON : NotificationsEditRedesignPushSettingValueDto.NO_SOUND))).subscribe(new xk30(new pe70(this, jf70Var2, r12, 0), 9), new ca10(new v4w(this, 13), 6)));
                return;
            }
            return;
        }
        if (le70Var2.equals(le70.i.b)) {
            return;
        }
        if (le70Var2.equals(le70.f.b)) {
            if (str == null) {
                T(bVar2);
                return;
            } else {
                X(str);
                return;
            }
        }
        if (le70Var2 instanceof le70.g) {
            UserId userId = ((le70.g) le70Var2).b;
            f4zVar.b(dVar);
            bVar.b(rsg0.T(yfb.x(lax0.g(this.k, userId, null, 6))).subscribe(new uk40(new n43(this, userId, jf70Var2, 3), 4), new pmu(new o010(this, 19), 9)));
            return;
        }
        if (le70Var2 instanceof le70.h) {
            UserId userId2 = ((le70.h) le70Var2).b;
            f4zVar.b(dVar);
            bVar.b(rsg0.T(yfb.x(this.j.a(userId2))).subscribe(new o3y(new rm9(this, userId2, jf70Var2, 5), 11), new c2y(new rj60(this, 2), 15)));
            return;
        }
        if (!(le70Var2 instanceof le70.j)) {
            if (!(le70Var2 instanceof le70.e)) {
                throw new NoWhenBranchMatchedException();
            }
            o0r0 e = xwk.e();
            Context context4 = e43.a;
            e.m(context4 != null ? context4 : null, ((le70.e) le70Var2).b, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
            return;
        }
        UserId userId3 = ((le70.j) le70Var2).b;
        List<Group> list = jf70Var2.j;
        if (list != null) {
            for (Group group : list) {
                if (epx.f(group.c, userId3)) {
                    r12 = !group.I;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        f4zVar.b(dVar);
        Boolean valueOf = Boolean.valueOf(r12);
        this.l.getClass();
        tfx tfxVar = new tfx("groups.setPushMessagesSettings", new j8(12), new jh(13));
        tfx.n(tfxVar, "group_id", userId3, 1L, 0L, 8);
        tfxVar.j("state", valueOf.booleanValue());
        bVar.b(rsg0.T(yfb.x(tfxVar)).subscribe(new vk40(new ne70(this, userId3, r12), 9), new qg60(new rop(this, 25), 3)));
    }

    public final void U(jf70 jf70Var, NotificationsNotificationSettingOptionsDto notificationsNotificationSettingOptionsDto) {
        String str = jf70Var.d;
        NotificationsNotificationSettingRedesignDto notificationsNotificationSettingRedesignDto = jf70Var.e;
        if (str != null) {
            if ((notificationsNotificationSettingRedesignDto != null ? notificationsNotificationSettingRedesignDto.f() : null) != null) {
                boolean z = notificationsNotificationSettingRedesignDto.f() == NotificationsNotificationSettingPushSettingDto.OFF;
                this.o.b(vzi0.d.a);
                Context context = e43.a;
                this.e.b(rsg0.T(yfb.x(this.i.y(b6m.d(context != null ? context : null), jf70Var.d, z ? NotificationsEditRedesignPushSettingValueDto.ON : NotificationsEditRedesignPushSettingValueDto.OFF))).subscribe(new c120(new oe70(0, notificationsNotificationSettingOptionsDto, this, jf70Var, z), 13), new lz(new cww(this, 21), 26)));
            }
        }
    }

    public final f4z V() {
        return this.o;
    }

    public final wj50<if70> W() {
        return this.n;
    }

    public final void X(String str) {
        T(cf70.k.b);
        Context context = e43.a;
        ArrayList arrayList = null;
        if (context == null) {
            context = null;
        }
        String d = b6m.d(context);
        this.i.getClass();
        tfx tfxVar = new tfx("notifications.getRedesignSetting", new io.reactivex.rxjava3.processors.b(25), new io.reactivex.rxjava3.subjects.b(28));
        tfx.o(tfxVar, "category_id", str, 0, 0, 12);
        if (d != null) {
            tfx.o(tfxVar, "device_id", d, 0, 0, 12);
        }
        io.reactivex.rxjava3.disposables.c subscribe = rsg0.T(yfb.x(tfxVar)).subscribe(new hu50(new px30(this, str), 4), new wnt(new cqv(this, 24), 15));
        io.reactivex.rxjava3.disposables.b bVar = this.e;
        bVar.b(subscribe);
        int hashCode = str.hashCode();
        cf70.i iVar = cf70.i.b;
        if (hashCode == -255930252) {
            if (str.equals("new_posts")) {
                T(iVar);
                tfx tfxVar2 = new tfx("wall.getSubscriptions", new gub0(6), new alb0(11));
                tfx.l(tfxVar2, SignalingProtocol.KEY_OFFSET, 0, 0, 0, 8);
                tfxVar2.f(0, 0, 1000, "count");
                tfxVar2.j("extended", true);
                bVar.b(rsg0.T(yfb.y(tfxVar2, new jnb(q9x0.a, 10))).subscribe(new t520(new c230(this, 7), 10), new p350(new l6u(this, 23), 2)));
                return;
            }
            return;
        }
        if (hashCode == 1482658608) {
            if (str.equals("groups_messages_pushes")) {
                T(iVar);
                UserId c = o25.a().c();
                List singletonList = Collections.singletonList(GroupsFilterDto.ADMIN);
                List<GroupsFieldsDto> l = e43.l(GroupsFieldsDto.ACTIVITY, GroupsFieldsDto.MSG_PUSH_ALLOWED, GroupsFieldsDto.VERIFIED);
                if (l == null) {
                    l = aqu.w;
                }
                bVar.b(rsg0.T(new aqu(c, singletonList, l, null)).subscribe(new pd40(new f410(this, 16), 5), new le50(new nl30(this, 9), 2)));
                return;
            }
            return;
        }
        if (hashCode == 1666060468 && str.equals("new_stories")) {
            T(iVar);
            List singletonList2 = Collections.singletonList(BaseUserGroupFieldsDto.PHOTO_BASE);
            this.j.getClass();
            tfx tfxVar3 = new tfx("stories.getSubscriptions", new cjl0(1), new sni0(4));
            tfxVar3.j("extended", true);
            if (singletonList2 != null) {
                List list = singletonList2;
                arrayList = new ArrayList(c5g.u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((BaseUserGroupFieldsDto) it.next()).i());
                }
            }
            if (arrayList != null) {
                tfxVar3.i("fields", arrayList);
            }
            bVar.b(rsg0.T(yfb.x(tfxVar3)).subscribe(new d120(new d410(this, 13), 8), new oz(new bgy(this, 17), 25)));
        }
    }
}
