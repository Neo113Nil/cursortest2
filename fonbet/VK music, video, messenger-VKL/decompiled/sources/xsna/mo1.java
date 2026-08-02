package xsna;

import com.vk.api.generated.shortVideo.dto.ShortVideoGetOwnerVideosResponseDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.sdk.auth.AccountProfileType;
import com.vk.clips.coauthors.domain.model.ClipsCoauthorSelectorUserItem;
import com.vk.clips.coauthors.domain.model.Restriction;
import com.vk.clips.coauthors.selector.presentation.state.ClipsCoauthorsSelectorMviState;
import com.vk.core.utils.newtork.NetworkState;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import com.vk.im.ui.components.contacts.DonutContactsListFactory;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.photos.ui.album_list.AlbumsListFragment;
import com.vk.video.ui.upload.impl.attachedclips.presentation.feature.entity.AttachedClipsState;
import com.vk.voip.dto.RecordType;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.c2r0;
import xsna.cnd;
import xsna.fnd;
import xsna.hh8;
import xsna.hvl;
import xsna.mhr;
import xsna.mvl;
import xsna.ohr;
import xsna.s9j0;
import xsna.t7j0;
import xsna.tj50;
import xsna.tlo0;
import xsna.ttg;
import xsna.umd;
import xsna.xbu0;
import xsna.yf8;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class mo1 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ mo1(int i) {
        this.b = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:181:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03fa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0404 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x041e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0427 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0432 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0376  */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean z;
        boolean z2;
        mvl bVar;
        t7j0 t7j0Var;
        s9j0 aVar;
        boolean z3;
        dfw0 dfw0Var;
        boolean z4;
        Object bVar2;
        cnd bVar3;
        int i;
        int i2;
        tlo0.a aVar2;
        int i3;
        Object obj2 = obj;
        boolean z5 = true;
        switch (this.b) {
            case 0:
                tgi0 tgi0Var = (tgi0) obj2;
                int i4 = AlbumsListFragment.a0;
                qgi0.r(tgi0Var, "toolbar_back_button");
                return s3q0.a;
            case 1:
                return AttachedClipsState.a((AttachedClipsState) obj2, null, null, null, null, null, false, false, false, false, null, 959);
            case 2:
                return Float.valueOf(((sy40) obj2).y);
            case 3:
                xbu0.a aVar3 = (xbu0.a) obj2;
                UserId userId = aVar3.a;
                String str = aVar3.b;
                String str2 = aVar3.c;
                String str3 = aVar3.d;
                AccountProfileType.a aVar4 = AccountProfileType.Companion;
                Integer valueOf = Integer.valueOf(aVar3.e.h());
                aVar4.getClass();
                AccountProfileType a = AccountProfileType.a.a(valueOf);
                if (a == null) {
                    a = AccountProfileType.NORMAL;
                }
                return new c2r0.b(userId, str, str2, str3, false, a);
            case 4:
                return s3q0.a;
            case 5:
                hh8 hh8Var = (hh8) obj2;
                if (hh8Var instanceof hh8.a) {
                    ohr ohrVar = ((hh8.a) hh8Var).i;
                    if (ohrVar instanceof ohr.c) {
                        bVar2 = yf8.c.a;
                    } else {
                        if (ohrVar instanceof ohr.a) {
                            bVar2 = yf8.a.a;
                        }
                        bVar2 = null;
                    }
                } else {
                    if (hh8Var instanceof hh8.b) {
                        hh8.b bVar4 = (hh8.b) hh8Var;
                        hvl hvlVar = bVar4.e;
                        boolean z6 = bVar4.g;
                        mhr mhrVar = bVar4.a;
                        RecordType recordType = bVar4.f;
                        RecordType recordType2 = RecordType.RECORD;
                        boolean z7 = recordType == recordType2;
                        hvlVar.getClass();
                        boolean z8 = hvlVar instanceof hvl.a;
                        if (!z8 && com.vk.voip.ui.c.b.P().l() && !z7 && !(mhrVar instanceof mhr.a)) {
                            if (!(mhrVar instanceof mhr.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (!o25.b(o25.a())) {
                                z = true;
                                boolean z9 = (bVar4.b instanceof rvw0) || com.vk.voip.ui.c.b.P().d();
                                z2 = hvlVar instanceof hvl.c;
                                if (!z2) {
                                    bVar = mvl.c.a;
                                } else if (hvlVar instanceof hvl.d) {
                                    bVar = mvl.d.a;
                                } else if (z8) {
                                    bVar = mvl.a.a;
                                } else {
                                    if (!(hvlVar instanceof hvl.b)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    bVar = new mvl.b(((hvl.b) hvlVar).a);
                                }
                                t7j0Var = bVar4.d;
                                if (!(t7j0Var instanceof t7j0.b)) {
                                    aVar = s9j0.b.a;
                                } else if (t7j0Var instanceof t7j0.c) {
                                    aVar = s9j0.c.a;
                                } else if (t7j0Var instanceof t7j0.d) {
                                    aVar = s9j0.d.a;
                                } else {
                                    if (!(t7j0Var instanceof t7j0.a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    aVar = new s9j0.a(((t7j0.a) t7j0Var).a);
                                }
                                if (!(mhrVar instanceof mhr.a)) {
                                    if (!(mhrVar instanceof mhr.b)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    if (!o25.b(o25.a())) {
                                        z3 = true;
                                        mhrVar.getClass();
                                        boolean z10 = mhrVar instanceof mhr.b;
                                        mhr.b bVar5 = z10 ? (mhr.b) mhrVar : null;
                                        dfw0Var = bVar5 != null ? bVar5.a : null;
                                        if (dfw0Var != null || (r11 = dfw0Var.k) == null) {
                                            Collection collection = EmptyList.b;
                                        }
                                        yf8.d dVar = new yf8.d(collection, dfw0Var != null ? dfw0Var.i : 0, collection.isEmpty() && !(recordType == recordType2), z3);
                                        if (!z8 && !z7) {
                                            if (!(mhrVar instanceof mhr.a)) {
                                            } else {
                                                if (!z10) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                z4 = true;
                                                bVar2 = new yf8.b(bVar, aVar, dVar, z4, z, z8 && z6, z7, !z7 && z2, !z7 && z6 && z9, bVar4.b);
                                            }
                                        }
                                        z4 = false;
                                        bVar2 = new yf8.b(bVar, aVar, dVar, z4, z, z8 && z6, z7, !z7 && z2, !z7 && z6 && z9, bVar4.b);
                                    }
                                }
                                z3 = false;
                                mhrVar.getClass();
                                boolean z102 = mhrVar instanceof mhr.b;
                                if (z102) {
                                }
                                if (bVar5 != null) {
                                }
                                if (dfw0Var != null) {
                                }
                                Collection collection2 = EmptyList.b;
                                if (recordType == recordType2) {
                                }
                                yf8.d dVar2 = new yf8.d(collection2, dfw0Var != null ? dfw0Var.i : 0, collection2.isEmpty() && !(recordType == recordType2), z3);
                                if (!z8) {
                                    if (!(mhrVar instanceof mhr.a)) {
                                    }
                                }
                                z4 = false;
                                bVar2 = new yf8.b(bVar, aVar, dVar2, z4, z, z8 && z6, z7, !z7 && z2, !z7 && z6 && z9, bVar4.b);
                            }
                        }
                        z = false;
                        if (bVar4.b instanceof rvw0) {
                        }
                        z2 = hvlVar instanceof hvl.c;
                        if (!z2) {
                        }
                        t7j0Var = bVar4.d;
                        if (!(t7j0Var instanceof t7j0.b)) {
                        }
                        if (!(mhrVar instanceof mhr.a)) {
                        }
                        z3 = false;
                        mhrVar.getClass();
                        boolean z1022 = mhrVar instanceof mhr.b;
                        if (z1022) {
                        }
                        if (bVar5 != null) {
                        }
                        if (dfw0Var != null) {
                        }
                        Collection collection22 = EmptyList.b;
                        if (recordType == recordType2) {
                        }
                        yf8.d dVar22 = new yf8.d(collection22, dfw0Var != null ? dfw0Var.i : 0, collection22.isEmpty() && !(recordType == recordType2), z3);
                        if (!z8) {
                        }
                        z4 = false;
                        bVar2 = new yf8.b(bVar, aVar, dVar22, z4, z, z8 && z6, z7, !z7 && z2, !z7 && z6 && z9, bVar4.b);
                    }
                    bVar2 = null;
                }
                return new it80(bVar2);
            case 6:
                return 0L;
            case 7:
                L.i((Throwable) obj2);
                cvk.u(R.string.collection_link_not_valid, false);
                return s3q0.a;
            case 8:
                r490.b = (x25) obj2;
                return s3q0.a;
            case 9:
                u0a u0aVar = (u0a) obj2;
                return Boolean.valueOf((u0aVar instanceof y280) && ((y280) u0aVar).a.z.contains("local_block_id"));
            case 10:
                return ((zk10) obj2).getValue().toLowerCase(Locale.ROOT);
            case 11:
                return s3q0.a;
            case 12:
                ClipsCoauthorsSelectorMviState.c cVar = (ClipsCoauthorsSelectorMviState.c) obj2;
                List<ClipsCoauthorSelectorUserItem> list = cVar.g;
                boolean z11 = cVar.h;
                Set<ClipsCoauthorSelectorUserItem> set = cVar.c;
                ArrayList arrayList = new ArrayList(c5g.u(set, 10));
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ClipsCoauthorSelectorUserItem) it.next()).b);
                }
                Set S0 = j5g.S0(arrayList);
                int i5 = cVar.f;
                boolean z12 = cVar.j;
                List<ClipsCoauthorSelectorUserItem> list2 = list;
                ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
                for (ClipsCoauthorSelectorUserItem clipsCoauthorSelectorUserItem : list2) {
                    boolean contains = S0.contains(clipsCoauthorSelectorUserItem.b);
                    UserId userId2 = clipsCoauthorSelectorUserItem.b;
                    String d = clipsCoauthorSelectorUserItem.d();
                    String str4 = clipsCoauthorSelectorUserItem.e;
                    Restriction restriction = clipsCoauthorSelectorUserItem.f;
                    if (restriction instanceof Restriction.None) {
                        bVar3 = new cnd.a(oq.d(tlo0.Companion, ((Restriction.None) restriction).b));
                    } else if (restriction.equals(Restriction.ClosedProfile.b)) {
                        bVar3 = new cnd.b(tq.h(tlo0.Companion, R.string.clips_coauthors_restriction_closed_profile));
                    } else if (restriction instanceof Restriction.Blacklisted) {
                        tlo0.a aVar5 = tlo0.Companion;
                        int i6 = fnd.a.$EnumSwitchMapping$0[((Restriction.Blacklisted) restriction).ordinal()];
                        if (i6 == 1) {
                            i2 = R.string.clips_coauthors_restriction_blacklisted;
                        } else {
                            if (i6 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i2 = R.string.clips_coauthors_restriction_blacklisted_female;
                        }
                        bVar3 = new cnd.b(tq.h(aVar5, i2));
                    } else if (restriction.equals(Restriction.BlacklistedByMe.b)) {
                        bVar3 = new cnd.b(tq.h(tlo0.Companion, R.string.clips_coauthors_restriction_blacklisted_by_me));
                    } else if (restriction instanceof Restriction.DisabledByPrivacy) {
                        tlo0.a aVar6 = tlo0.Companion;
                        int i7 = fnd.a.$EnumSwitchMapping$1[((Restriction.DisabledByPrivacy) restriction).ordinal()];
                        if (i7 == 1) {
                            i = R.string.clips_coauthors_restriction_disabled_by_privacy;
                        } else if (i7 == 2) {
                            i = R.string.clips_coauthors_restriction_disabled_by_privacy_female;
                        } else {
                            if (i7 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i = R.string.clips_coauthors_restriction_disabled_by_privacy_community;
                        }
                        bVar3 = new cnd.b(tq.h(aVar6, i));
                    } else if (restriction.equals(Restriction.CommunityBanned.b)) {
                        bVar3 = new cnd.b(tq.h(tlo0.Companion, R.string.clips_coauthors_restriction_community_blocked));
                    } else {
                        if (!restriction.equals(Restriction.CommunityClosed.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        bVar3 = new cnd.b(tq.h(tlo0.Companion, R.string.clips_coauthors_restriction_community_closed));
                    }
                    int i8 = fnd.a.$EnumSwitchMapping$2[clipsCoauthorSelectorUserItem.h.ordinal()];
                    if (i8 != 1) {
                        if (i8 != 2) {
                            if (i8 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (contains) {
                                aVar2 = tlo0.Companion;
                                i3 = R.string.clips_coauthors_accessibility_author_selected_group;
                            } else {
                                aVar2 = tlo0.Companion;
                                i3 = R.string.clips_coauthors_accessibility_author_not_selected_group;
                            }
                        } else if (contains) {
                            aVar2 = tlo0.Companion;
                            i3 = R.string.clips_coauthors_accessibility_author_selected_female;
                        } else {
                            aVar2 = tlo0.Companion;
                            i3 = R.string.clips_coauthors_accessibility_author_not_selected_female;
                        }
                    } else if (contains) {
                        aVar2 = tlo0.Companion;
                        i3 = R.string.clips_coauthors_accessibility_author_selected_male;
                    } else {
                        aVar2 = tlo0.Companion;
                        i3 = R.string.clips_coauthors_accessibility_author_not_selected_male;
                    }
                    arrayList2.add(new gmd(userId2, d, str4, contains, bVar3, tq.h(aVar2, i3)));
                    z5 = true;
                }
                boolean z13 = z5;
                if (z11) {
                    return new umd.d(arrayList2, list.size() < i5 ? z13 : false, z12);
                }
                return new umd.c(arrayList2);
            case 13:
                return Boolean.valueOf(((NetworkState) obj2).d);
            case 14:
                return ((zk10) obj2).getValue().toLowerCase(Locale.ROOT);
            case 15:
                return (UsersUserFullDto) j5g.Y((List) obj2);
            case 16:
                return ((stf) obj2).b;
            case 17:
                return s3q0.a;
            case 18:
                tj50.a aVar7 = (tj50.a) obj2;
                qb qbVar = new qb(18);
                ao8 ao8Var = ao8.d;
                return new ttg.a(aVar7.a(qbVar, ao8Var), aVar7.a(new wh1(9), ao8Var));
            case 19:
                return ((fzg) obj2).r;
            case 20:
                Map.Entry entry = (Map.Entry) obj2;
                return new Pair(entry.getKey(), ((UserProfile) entry.getValue()).l0());
            case 21:
                ShortVideoGetOwnerVideosResponseDto shortVideoGetOwnerVideosResponseDto = (ShortVideoGetOwnerVideosResponseDto) obj2;
                return ums0.f(ums0.a, shortVideoGetOwnerVideosResponseDto.e(), shortVideoGetOwnerVideosResponseDto.j(), shortVideoGetOwnerVideosResponseDto.d());
            case 22:
                tgi0 tgi0Var2 = (tgi0) obj2;
                qgi0.r(tgi0Var2, "community_top_bar_menu_icon");
                qgi0.n(tgi0Var2, 6);
                return s3q0.a;
            case 23:
                ((Boolean) obj2).getClass();
                return Boolean.TRUE;
            case 24:
                return ((c9k) obj2).B;
            case 25:
                return ((zk10) obj2).b().get(1);
            case 26:
                if (!(obj2 instanceof Iterable)) {
                    obj2 = Collections.singletonList(obj2);
                }
                return (Iterable) obj2;
            case 27:
                w8j w8jVar = (w8j) obj2;
                DonutContactsListFactory donutContactsListFactory = DonutContactsListFactory.SELECT_DONUT_USERS_VKAPP;
                return new obm(w8jVar.a, w8jVar.b, w8jVar.c);
            case 28:
                Throwable th = (Throwable) obj2;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.e, new Object[]{ms9.b("Draft couldn't remove. Exception: ", th)});
                }
                return s3q0.a;
            default:
                return s3q0.a;
        }
    }

    public /* synthetic */ mo1(Object obj, int i) {
        this.b = i;
    }
}
