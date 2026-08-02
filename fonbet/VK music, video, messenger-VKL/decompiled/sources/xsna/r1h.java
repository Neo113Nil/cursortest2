package xsna;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.profile.Address;
import com.vk.dto.profile.OpenStatus;
import com.vk.dto.profile.Timetable;
import com.vk.typography.Font;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vkontakte.android.R;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.loh0;
import xsna.q630;
import xsna.ty6;
import xsna.us2;

/* compiled from: CommunityDetailsInfoItem.kt */
/* loaded from: classes5.dex */
public final class r1h {

    /* compiled from: CommunityDetailsInfoItem.kt */
    public static final class a implements wq5<String> {
        public static final a b = new a();

        @Override // xsna.wq5
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void e(String str, final yzs<? super lg90, ? super androidx.compose.runtime.a, ? super Integer, s3q0> yzsVar, androidx.compose.runtime.a aVar, int i) {
            int i2;
            Object obj;
            androidx.compose.runtime.a M = aVar.M(1272601670);
            if ((i & 6) == 0) {
                i2 = (M.J(str) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= M.y(yzsVar) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                obj = this;
                i2 |= M.J(obj) ? 256 : 128;
            } else {
                obj = this;
            }
            if (M.t(i2 & 1, (i2 & 147) != 146)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1272601670, i2, -1, "com.vk.search.communities.map.impl.ui.details.compose.component.MembersInfoItem.<anonymous>.<anonymous>.<anonymous>.<no name provided>.Content (CommunityDetailsInfoItem.kt:83)");
                }
                fwu0.c(null, null, str, null, null, null, null, kai.c(-1777719913, new a0t() { // from class: xsna.p1h
                    @Override // xsna.a0t
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                        lg90 lg90Var = (lg90) obj4;
                        androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj5;
                        int intValue = ((Integer) obj6).intValue();
                        if ((intValue & 384) == 0) {
                            intValue |= (intValue & 512) == 0 ? aVar2.J(lg90Var) : aVar2.y(lg90Var) ? 256 : 128;
                        }
                        if (aVar2.t(intValue & 1, (intValue & 1153) != 1152)) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-1777719913, intValue, -1, "com.vk.search.communities.map.impl.ui.details.compose.component.MembersInfoItem.<anonymous>.<anonymous>.<anonymous>.<no name provided>.Content.<anonymous> (CommunityDetailsInfoItem.kt:84)");
                            }
                            if (as.a(((intValue >> 6) & 14) | 8, yzs.this, lg90Var, aVar2)) {
                                androidx.compose.runtime.b.e();
                            }
                        } else {
                            aVar2.h();
                        }
                        return s3q0.a;
                    }
                }, M), M, ((i2 << 6) & 896) | 100663296, 251);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new q1h(i, 0, obj, str, yzsVar);
            }
        }
    }

    public static final void a(loh0.d.a aVar, androidx.compose.runtime.a aVar2, int i) {
        androidx.compose.runtime.a M = aVar2.M(-1537484421);
        int i2 = (M.J(aVar) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1537484421, i2, -1, "com.vk.search.communities.map.impl.ui.details.compose.component.AddressInfoItem (CommunityDetailsInfoItem.kt:92)");
            }
            qzu0.a.getClass();
            c(qzu0.b1(M), new us2(aVar.a), null, null, null, M, 8, 28);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new yg7(aVar, i, 3);
        }
    }

    public static final void b(loh0.d dVar, izs<? super ynh0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(528277046);
        if ((i & 6) == 0) {
            i2 = (M.J(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(528277046, i2, -1, "com.vk.search.communities.map.impl.ui.details.compose.component.CommunityDetailsInfoItem (CommunityDetailsInfoItem.kt:50)");
            }
            if (dVar instanceof loh0.d.b) {
                M.K(1141567135);
                d((loh0.d.b) dVar, M, 0);
                M.j();
            } else if (dVar instanceof loh0.d.a) {
                M.K(1141683199);
                a((loh0.d.a) dVar, M, 0);
                M.j();
            } else if (dVar instanceof loh0.d.C3281d) {
                M.K(1141804378);
                f((loh0.d.C3281d) dVar, M, 0);
                M.j();
            } else {
                if (!(dVar instanceof loh0.d.c)) {
                    throw alb0.c(868106545, M);
                }
                M.K(1141940034);
                e(izsVar, M, (i2 >> 3) & 14);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new n2f(dVar, izsVar, i, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final lg90 lg90Var, final us2 us2Var, q630 q630Var, gzs<s3q0> gzsVar, wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        gzs<s3q0> gzsVar2;
        int i3;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar2;
        int i4;
        final q630 q630Var2;
        final wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar3;
        androidx.compose.runtime.f s;
        long j;
        long j2;
        androidx.compose.runtime.a M = aVar.M(419814276);
        int i5 = (M.y(lg90Var) ? 4 : 2) | i | (M.J(us2Var) ? 32 : 16);
        int i6 = i5 | 384;
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 = i5 | 3456;
            gzsVar2 = gzsVar;
        } else {
            gzsVar2 = gzsVar;
            i3 = i6 | (M.y(gzsVar2) ? 2048 : 1024);
        }
        int i8 = i2 & 16;
        if (i8 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            wzsVar2 = wzsVar;
            i3 |= M.y(wzsVar2) ? 16384 : 8192;
            i4 = i3;
            if (M.t(i4 & 1, (i4 & 9363) == 9362)) {
                M.h();
                q630Var2 = q630Var;
                wzsVar3 = wzsVar2;
            } else {
                if (i7 != 0) {
                    gzsVar2 = null;
                }
                wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar4 = i8 != 0 ? up2.c : wzsVar2;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(419814276, i4, -1, "com.vk.search.communities.map.impl.ui.details.compose.component.GroupDetailsInfoItem (CommunityDetailsInfoItem.kt:123)");
                }
                q630.a aVar2 = q630.a.a;
                q630 J = gzsVar2 != null ? xa4.J(rte0.d(aVar2, vog0.b(4)), true, gzsVar2) : aVar2;
                dt1.a.getClass();
                ty6.b bVar = dt1.a.l;
                a.j g = androidx.compose.foundation.layout.a.g(12);
                Object x = M.x();
                if (x == a.C0011a.a) {
                    x = new d40(19);
                    M.R(x);
                }
                q630 F = s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 28, 1, egi0.b(aVar2, true, (izs) x)).g(J));
                androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(g, bVar, M, 54);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, F);
                cri.h7.getClass();
                LayoutNode.a aVar3 = cri.a.b;
                if (M.N() == null) {
                    n34.r();
                    throw null;
                }
                M.H();
                if (M.L()) {
                    M.I(aVar3);
                } else {
                    M.f();
                }
                k9q0.w(M, a2, cri.a.f);
                k9q0.w(M, D, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c, cri.a.d);
                if (gzsVar2 == null) {
                    M.K(-2078704871);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j = ylu0Var.getIcon().l;
                    M.j();
                } else {
                    M.K(-2078634346);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j = ylu0Var2.getIcon().b;
                    M.j();
                }
                wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar5 = wzsVar4;
                vqv.a(lg90Var, null, txj0.q(aVar2, 20), j, M, 440 | (i4 & 14), 0);
                frv0 frv0Var = wlb0.l(M).c0;
                if (gzsVar2 == null) {
                    j2 = gub0.a(M, -2078368583, M).p;
                    M.j();
                } else {
                    j2 = gub0.a(M, -2078298058, M).c;
                    M.j();
                }
                long j3 = j2;
                if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    szw.a("invalid weight; must be greater than zero");
                }
                yqv0.d(us2Var, new xpy(1.0f, true), j3, 0, null, 2, false, 1, null, null, frv0Var, M, ((i4 >> 3) & 14) | 100663296, 6, 6904);
                M = M;
                wzsVar5.invoke(M, Integer.valueOf((i4 >> 12) & 14));
                M.G();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630Var2 = aVar2;
                wzsVar3 = wzsVar5;
            }
            final gzs<s3q0> gzsVar3 = gzsVar2;
            s = M.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.o1h
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        r1h.c(lg90.this, us2Var, q630Var2, gzsVar3, wzsVar3, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        wzsVar2 = wzsVar;
        i4 = i3;
        if (M.t(i4 & 1, (i4 & 9363) == 9362)) {
        }
        final gzs gzsVar32 = gzsVar2;
        s = M.s();
        if (s == null) {
        }
    }

    public static final void d(loh0.d.b bVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-319292091);
        int i2 = (M.J(bVar) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-319292091, i2, -1, "com.vk.search.communities.map.impl.ui.details.compose.component.MembersInfoItem (CommunityDetailsInfoItem.kt:71)");
            }
            boolean z = bVar.d;
            int i3 = bVar.b;
            int i4 = bVar.a;
            if (z) {
                M.K(1322004606);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(983561468, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Done24> (VkSdkIcons.kt:704)");
                }
                lg90 a2 = pg90.a(R.drawable.vk_icon_done_24, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                us2.b bVar2 = new us2.b();
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                bVar2.g(context.getString(R.string.community_subscribed));
                bVar2.f(rik0.a);
                int length = bVar2.b.length();
                String i5 = uqm0.i(i4, R.plurals.community_subscribers, R.string.community_subscribers_formatted, true);
                bVar2.g(i5);
                bVar2.d(new hik0(0L, 0L, b6s.i, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531), length, drm0.L(i5, ' ', 0, 6) + length);
                c(a2, bVar2.n(), null, null, null, M, 8, 28);
                M.j();
            } else {
                M.K(1322144850);
                qzu0.a.getClass();
                lg90 B1 = qzu0.B1(M);
                us2.b bVar3 = new us2.b();
                String i6 = uqm0.i(i4, R.plurals.community_subscribers, R.string.community_subscribers_formatted, true);
                bVar3.g(i6);
                b6s b6sVar = b6s.i;
                bVar3.d(new hik0(0L, 0L, b6sVar, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531), 0, drm0.L(i6, ' ', 0, 6));
                if (i3 > 0) {
                    bVar3.f(rik0.a);
                    int length2 = bVar3.b.length();
                    String i7 = uqm0.i(i3, R.plurals.community_friends, R.string.community_friends_formatted, true);
                    bVar3.g(i7);
                    bVar3.d(new hik0(0L, 0L, b6sVar, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531), length2, drm0.L(i7, ' ', 0, 6) + length2);
                }
                c(B1, bVar3.n(), null, null, kai.c(-12490114, new w69(bVar, 3), M), M, 24584, 12);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new o85(bVar, i, 3);
        }
    }

    public static final void e(izs<? super ynh0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-2036998383);
        if ((i & 6) == 0) {
            i2 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2036998383, i2, -1, "com.vk.search.communities.map.impl.ui.details.compose.component.NavigateToGroupButtonInfoItem (CommunityDetailsInfoItem.kt:108)");
            }
            qzu0.a.getClass();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1852571952, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-ArrowRightCircleOutline28> (VkIcons.kt:332)");
            }
            lg90 a2 = pg90.a(R.drawable.vk_icon_arrow_right_circle_outline_28, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            us2 us2Var = new us2(d370.N(R.string.search_action_open_community, 0, M));
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new lv7(izsVar, 2);
                M.R(x);
            }
            c(a2, us2Var, null, (gzs) x, null, M, 8, 20);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new n1h(i, 0, izsVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0238  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(loh0.d.C3281d c3281d, androidx.compose.runtime.a aVar, int i) {
        CharSequence spannableString;
        Timetable timetable;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        androidx.compose.runtime.a M = aVar.M(-1954301087);
        int i7 = (M.J(c3281d) ? 4 : 2) | i;
        if (M.t(i7 & 1, (i7 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1954301087, i7, -1, "com.vk.search.communities.map.impl.ui.details.compose.component.OpeningStateInfoItem (CommunityDetailsInfoItem.kt:100)");
            }
            qzu0.a.getClass();
            lg90 h1 = qzu0.h1(M);
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            Address address = c3281d.a;
            SpannableString spannableString2 = nt0.b;
            int i8 = address.m;
            OpenStatus openStatus = address.t;
            if (openStatus != null) {
                String str = openStatus.d;
                String str2 = openStatus.c;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i9 = openStatus.b;
                Integer valueOf = i9 != 1 ? i9 != 2 ? i9 != 3 ? null : Integer.valueOf(R.color.vk_orange) : Integer.valueOf(R.color.vk_red) : Integer.valueOf(R.color.vk_green);
                if (valueOf != null) {
                    SpannableString spannableString3 = new SpannableString(str2);
                    nt0.c(context, spannableString3, valueOf.intValue());
                    str2 = spannableString3;
                }
                spannableStringBuilder.append((CharSequence) str2);
                spannableString = spannableStringBuilder;
                if (!drm0.N(str)) {
                    spannableStringBuilder.append((CharSequence) spannableString2);
                    spannableStringBuilder.append((CharSequence) str);
                    spannableString = spannableStringBuilder;
                }
            } else if (i8 == 2 && (timetable = address.o) != null) {
                int i10 = address.n;
                Timetable.WorkTime[] workTimeArr = timetable.b;
                Calendar calendar = Calendar.getInstance();
                if (i10 != Integer.MAX_VALUE) {
                    int i11 = i10 * 60000;
                    qvo0.a.getClass();
                    TimeZone timeZone = TimeZone.getDefault();
                    Date date = new Date();
                    int rawOffset = TimeZone.getDefault().getRawOffset();
                    if (timeZone.inDaylightTime(date)) {
                        rawOffset += timeZone.getDSTSavings();
                    }
                    i2 = i11 - rawOffset;
                } else {
                    i2 = 0;
                }
                calendar.setTimeInMillis(System.currentTimeMillis() + i2);
                int i12 = calendar.get(7);
                int i13 = i12 - 2;
                if (i13 < 0) {
                    i13 = i12 + 5;
                }
                Timetable.WorkTime workTime = workTimeArr[i13];
                int i14 = calendar.get(12) + (calendar.get(11) * 60);
                int i15 = i13 - 1;
                if (i15 < 0) {
                    i15 = 6;
                }
                Timetable.WorkTime workTime2 = workTimeArr[i13];
                Timetable.WorkTime workTime3 = workTimeArr[i15];
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                if (workTime2 != null || workTime3 != null) {
                    if (workTime3 == null || workTime3.b <= (i5 = workTime3.c) || i14 >= i5) {
                        if (workTime2 != null && (((i4 = workTime2.b) < (i3 = workTime2.c) && i14 > i4 && i14 < i3) || (i4 > i3 && i14 > i4 && i14 < i3 + 1440))) {
                            if (i14 <= workTime2.d || i14 >= workTime2.e) {
                                spannableStringBuilder2.append((CharSequence) nt0.b(R.string.address_opened, R.color.vk_green, context)).append((CharSequence) spannableString2);
                                int i16 = (i3 - i14 < 0 ? i3 + 1440 : i3) - i14;
                                if (i16 < 60) {
                                    spannableStringBuilder2.append((CharSequence) context.getString(R.string.address_will_be_closed_after, context.getResources().getQuantityString(R.plurals.address_minutes, i16, Integer.valueOf(i16))));
                                } else {
                                    spannableStringBuilder2.append((CharSequence) context.getString(R.string.address_will_be_closed_in, nt0.f(i3)));
                                }
                            } else {
                                spannableStringBuilder2.append((CharSequence) nt0.b(R.string.address_break, R.color.vk_orange, context)).append((CharSequence) spannableString2).append((CharSequence) context.getString(R.string.address_will_be_opened_at, nt0.f(workTime2.e)));
                            }
                        }
                    } else if (i14 <= workTime3.d || i14 >= workTime3.e) {
                        spannableStringBuilder2.append((CharSequence) nt0.b(R.string.address_opened, R.color.vk_green, context)).append((CharSequence) spannableString2);
                        int i17 = (i5 - i14 < 0 ? i5 + 1440 : i5) - i14;
                        if (i17 < 60) {
                            spannableStringBuilder2.append((CharSequence) context.getString(R.string.address_will_be_closed_after, context.getResources().getQuantityString(R.plurals.address_minutes, i17, Integer.valueOf(i17))));
                        } else {
                            spannableStringBuilder2.append((CharSequence) context.getString(R.string.address_will_be_closed_in, nt0.f(i5)));
                        }
                    } else {
                        spannableStringBuilder2.append((CharSequence) nt0.b(R.string.address_break, R.color.vk_orange, context)).append((CharSequence) spannableString2).append((CharSequence) context.getString(R.string.address_will_be_opened_at, nt0.f(i5)));
                    }
                    if (spannableStringBuilder2 == null) {
                        spannableString = spannableStringBuilder2;
                    } else if (workTime == null) {
                        spannableString = nt0.g(i13, workTimeArr, context);
                    } else {
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                        spannableStringBuilder3.append((CharSequence) nt0.b(R.string.address_closed, R.color.vk_red, context));
                        spannableStringBuilder3.append((CharSequence) " · ");
                        int i18 = workTime.b;
                        if (i14 < i18 && (i6 = i18 - i14) < 60) {
                            spannableStringBuilder3.append((CharSequence) context.getString(R.string.address_will_be_opened_after, context.getResources().getQuantityString(R.plurals.address_minutes, i6, Integer.valueOf(i6))));
                        } else if (i14 < i18) {
                            spannableStringBuilder3.append((CharSequence) context.getString(R.string.address_will_be_opened_at, nt0.f(i18)));
                        } else {
                            spannableString = nt0.g(i13, workTimeArr, context);
                        }
                        spannableString = spannableStringBuilder3;
                    }
                }
                spannableStringBuilder2 = null;
                if (spannableStringBuilder2 == null) {
                }
            } else if (i8 == 4) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                SpannableString spannableString4 = new SpannableString(context.getString(R.string.address_opened));
                spannableString4.setSpan(new ForegroundColorSpan(context.getColor(R.color.vk_green)), 0, spannableString4.length(), 33);
                Typeface a2 = cqi.a(Font.Companion, FontFamily.MEDIUM, 13.0f, context);
                TextSizeUnit textSizeUnit = TextSizeUnit.SP;
                spannableString4.setSpan(new pup0(a2), 0, spannableString4.length(), 0);
                spannableStringBuilder4.append((CharSequence) spannableString4);
                spannableStringBuilder4.append((CharSequence) spannableString2);
                spannableStringBuilder4.append((CharSequence) context.getString(R.string.address_open_all_day));
                spannableString = spannableStringBuilder4;
            } else if (i8 == 3 || i8 == 1) {
                spannableString = new SpannableString(context.getString(i8 == 3 ? R.string.foreve_closed : R.string.temporary_closed));
            } else {
                spannableString = context.getString(R.string.work_status_no_info);
            }
            us2.b bVar = new us2.b();
            bVar.f(spannableString);
            Spanned spanned = spannableString instanceof Spannable ? (Spannable) spannableString : null;
            if (spanned != null) {
                for (Object obj : spanned.getSpans(0, spanned.length(), ForegroundColorSpan.class)) {
                    ForegroundColorSpan foregroundColorSpan = (ForegroundColorSpan) obj;
                    bVar.d(new hik0(f870.c(foregroundColorSpan.getForegroundColor()), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534), spanned.getSpanStart(foregroundColorSpan), spanned.getSpanEnd(foregroundColorSpan));
                }
            }
            c(h1, bVar.n(), null, null, null, M, 8, 28);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new zg7(c3281d, i, 2);
        }
    }
}
