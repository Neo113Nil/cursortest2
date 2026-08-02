package xsna;

import android.location.Location;
import android.widget.LinearLayout;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.core.view.components.cell.VkMiniInfoCell;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.id.UserId;
import com.vk.dto.profile.Address;
import com.vk.dto.profile.MetroStation;
import com.vk.dto.profile.Timetable;
import com.vk.superapp.api.dto.identity.WebCity;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import java.util.Calendar;
import java.util.List;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import xsna.tlo0;

/* compiled from: CommunityAddressViewHolder.kt */
/* loaded from: classes5.dex */
public final class arg {
    public final LinearLayout a;
    public final VkTopBar b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final s3i[] i;
    public Address j;
    public UserId k;
    public Location l;

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object, kotlin.Lazy] */
    public arg(LinearLayout linearLayout, cb cbVar) {
        this.a = linearLayout;
        this.b = (VkTopBar) linearLayout.findViewById(R.id.community_address_top_bar);
        com.vk.movika.sdk.base.logic.processor.actions.d dVar = new com.vk.movika.sdk.base.logic.processor.actions.d(this, 26);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.c = msy.a(lazyThreadSafetyMode, dVar);
        this.d = msy.a(lazyThreadSafetyMode, new hg(this, 29));
        this.e = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.logic.processor.actions.f(this, 28));
        this.f = msy.a(lazyThreadSafetyMode, new nef(this, 2));
        this.g = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.logic.processor.actions.h(this, 28));
        this.h = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.logic.processor.actions.i(this, 22));
        s3i[] s3iVarArr = new s3i[7];
        for (int i = 0; i < 7; i++) {
            s3iVarArr[i] = null;
        }
        this.i = s3iVarArr;
        this.k = UserId.d;
        this.a.setOnClickListener(new o44(0));
        this.b.setAfter(VkTopBar.a.C0875a.a(new VkTopBar.a.c.f(new gko(R.drawable.vk_icon_cancel_28), tq.h(tlo0.Companion, R.string.community_addresses_close_address_modal), cbVar, null, null, null, 56), null, 6));
        this.b.setTransitionHeaderColor(VkTopBar.m.b.a);
        ((VkMiniInfoCell) this.c.getValue()).setIcon(new VkMiniInfoCell.d(new gko(R.drawable.vk_icon_place_outline_20), null, 6));
        VkMiniInfoCell vkMiniInfoCell = (VkMiniInfoCell) this.c.getValue();
        VkMiniInfoCell.Mode mode = VkMiniInfoCell.Mode.BaseAccent;
        vkMiniInfoCell.setMode(mode);
        a().setIcon(new VkMiniInfoCell.d(new gko(R.drawable.vk_icon_circle_small_20), null, 6));
        a().setMode(mode);
        b().setIcon(new VkMiniInfoCell.d(new gko(R.drawable.vk_icon_phone_outline_20), null, 6));
        b().setMode(VkMiniInfoCell.Mode.Link);
        ((VkMiniInfoCell) this.f.getValue()).setIcon(new VkMiniInfoCell.d(new gko(R.drawable.vk_icon_recent_outline_20), null, 6));
        ((VkMiniInfoCell) this.f.getValue()).setMode(VkMiniInfoCell.Mode.Base);
        String[] j = enj.j(R.array.community_addresses_weekdays, this.a.getContext());
        for (int i2 = 0; i2 < 7; i2++) {
            s3i s3iVar = new s3i(((LinearLayout) this.g.getValue()).getContext());
            ((LinearLayout) this.g.getValue()).addView(s3iVar, -1, -2);
            s3iVar.setDay(j[i2]);
            this.i[i2] = s3iVar;
        }
        ((VkSimpleButton) this.h.getValue()).setOnClickListener(new q3(this, 3));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final VkMiniInfoCell a() {
        return (VkMiniInfoCell) this.d.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final VkMiniInfoCell b() {
        return (VkMiniInfoCell) this.e.getValue();
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, kotlin.Lazy] */
    public final void c(UserId userId, Address address) {
        String str;
        String str2;
        this.j = address;
        this.k = userId;
        String str3 = address.e;
        ucp ucpVar = ucp.a;
        this.b.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(ucp.i(str3).toString(), (e4) null, (VkTopBar.Middle.Text.Title.a) null, (VkTopBar.Middle.Text.Title.Size) null, 14), null, null, com.vk.core.compose.component.semantics.b.a(null, new e60(17), 3), 6));
        d(address);
        MetroStation metroStation = address.p;
        if (metroStation != null) {
            a().setVisibility(0);
            a().setMiddle(new VkMiniInfoCell.e(oq.d(tlo0.Companion, metroStation.c), false, false, false, false, null, 62));
            a().setDecorator(new zqg(metroStation));
        } else {
            a().setVisibility(8);
        }
        String str4 = address.q;
        if (str4 == null || str4.length() == 0) {
            b().setVisibility(8);
        } else {
            b().setVisibility(0);
            b().setOnClickListener(new kn9(str4, 2));
            b().setMiddle(new VkMiniInfoCell.e(oq.d(tlo0.Companion, str4), false, false, false, false, null, 62));
        }
        VkMiniInfoCell vkMiniInfoCell = (VkMiniInfoCell) this.f.getValue();
        tlo0.a aVar = tlo0.Companion;
        LinearLayout linearLayout = this.a;
        CharSequence q = sv1.q(address, linearLayout.getContext());
        aVar.getClass();
        vkMiniInfoCell.setMiddle(new VkMiniInfoCell.e(new tlo0.h(q), false, false, false, false, null, 62));
        int i = address.m;
        Timetable timetable = address.o;
        ?? r8 = this.g;
        if (i != 2 || timetable == null) {
            ((LinearLayout) r8.getValue()).setVisibility(8);
        } else {
            ((LinearLayout) r8.getValue()).setVisibility(0);
            int i2 = (Calendar.getInstance().get(7) + 6) % 7;
            Timetable.WorkTime[] workTimeArr = timetable.b;
            int length = workTimeArr.length;
            int i3 = 0;
            while (i3 < length) {
                s3i s3iVar = this.i[i3];
                if (s3iVar != null) {
                    Timetable.WorkTime workTime = workTimeArr[i3];
                    if (workTime == null) {
                        str2 = ((LinearLayout) r8.getValue()).getContext().getString(R.string.address_closed);
                    } else {
                        int i4 = workTime.e;
                        int i5 = workTime.c;
                        int i6 = workTime.b;
                        int i7 = workTime.d;
                        if (i4 <= 0 || i7 <= 0) {
                            str = nt0.f(i6) + " - " + nt0.f(i5);
                        } else {
                            str = nt0.f(i6) + " - " + nt0.f(i7) + ", " + nt0.f(i4) + " - " + nt0.f(i5);
                        }
                        str2 = str;
                    }
                    s3iVar.setStatus(str2);
                }
                if (s3iVar != null) {
                    s3iVar.setAccent(i3 == i2);
                }
                i3++;
            }
        }
        List r = m4s.r(linearLayout.getContext(), address.c, address.d);
        ?? r4 = this.h;
        if (r == null || r.isEmpty()) {
            ((VkSimpleButton) r4.getValue()).setVisibility(8);
        } else {
            ((VkSimpleButton) r4.getValue()).setVisibility(0);
        }
        boolean z = address.r;
        Set<String> set = p0e0.a;
        b.d dVar = new b.d("groups_addresses");
        dVar.b("show_info", "action");
        dVar.b(userId, "group_id");
        dVar.b(Integer.valueOf(z ? 1 : 0), "has_vk_taxi");
        dVar.e();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void d(Address address) {
        Integer j;
        StringBuilder sb = new StringBuilder();
        sb.append(address.f);
        String str = address.g;
        if (str != null && str.length() != 0) {
            sb.append(", ");
            sb.append(str);
        }
        WebCity webCity = address.h;
        String str2 = webCity != null ? webCity.c : null;
        if (str2 != null && str2.length() != 0) {
            sb.append(", ");
            sb.append(address.h.c);
        }
        Location location = this.l;
        if (location != null && (j = sv1.j(location, address)) != null) {
            int intValue = j.intValue();
            sb.append(", ");
            sb.append(k7b0.e(intValue, this.a.getContext()));
        }
        ((VkMiniInfoCell) this.c.getValue()).setMiddle(new VkMiniInfoCell.e(oq.d(tlo0.Companion, sb.toString()), true, false, false, false, null, 60));
    }
}
