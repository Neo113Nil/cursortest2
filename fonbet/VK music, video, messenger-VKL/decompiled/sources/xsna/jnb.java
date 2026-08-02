package xsna;

import android.content.Context;
import android.net.Uri;
import android.text.format.DateUtils;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseSexDto;
import com.vk.api.generated.friends.dto.FriendsFriendStatusStatusDto;
import com.vk.api.generated.friends.dto.FriendsRequestsMutualDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullMemberStatusDto;
import com.vk.api.generated.groups.dto.GroupsGroupIsClosedDto;
import com.vk.api.generated.users.dto.UsersSubscriptionsItemDto;
import com.vk.api.generated.wall.dto.WallGetSubscriptionsExtendedResponseDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.MutualInfo;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.group.GroupLeaveMode;
import com.vk.dto.user.OnlineInfo;
import com.vk.dto.user.UserProfile;
import com.vk.dto.user.UserSex;
import com.vk.dto.user.VisibleStatus;
import com.vk.dto.user.deactivation.DeactivationWithMessage;
import com.vk.ecomm.reviews.impl.marketitem.replies.presentation.p;
import com.vk.imageloader.ImageScreenSize;
import com.vk.log.L;
import com.vk.music.playlist.display.audiobook.presentation.fragment.DisplayAudioBookChaptersFragment;
import com.vk.newsfeed.posting.impl.domain.model.LocalAlbum;
import com.vk.newsfeed.posting.impl.domain.model.LocalMediaEntry;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerPageLoadType;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerSelectedItem;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerState;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.domain.model.a;
import com.vkontakte.android.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.dzh;
import xsna.f0n0;
import xsna.fvz;
import xsna.gvz;
import xsna.oig0;
import xsna.xn50;

/* compiled from: ChatClipsBottomBarDecorationFeature.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class jnb extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jnb(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        hfz a;
        String str;
        List g;
        String str2;
        UserId userId;
        UserProfile userProfile;
        GroupLeaveMode groupLeaveMode;
        String str3;
        MutualInfo mutualInfo;
        DeactivationWithMessage deactivationWithMessage;
        ArrayList arrayList;
        kvz kvzVar;
        Context context;
        String str4;
        boolean z = true;
        switch (this.b) {
            case 0:
                L.i((Throwable) obj);
                return s3q0.a;
            case 1:
                L.i((Throwable) obj);
                return s3q0.a;
            case 2:
                tte tteVar = (tte) this.receiver;
                tteVar.getClass();
                xn50.a.c(tteVar, (jte) obj);
                return s3q0.a;
            case 3:
                hqg hqgVar = (hqg) this.receiver;
                hqgVar.getClass();
                xn50.a.c(hqgVar, (fqg) obj);
                return s3q0.a;
            case 4:
                ((com.vk.profile.community.impl.ui.profile.a) this.receiver).T((com.vk.profile.community.impl.ui.profile.d) obj);
                return s3q0.a;
            case 5:
                a0i<zzh> a0iVar = ((ryh) this.receiver).b;
                if (epx.f((oig0) obj, oig0.c.a)) {
                    a0iVar.c(dzh.o.a);
                } else {
                    a0iVar.c(new dzh.b(false));
                }
                return s3q0.a;
            case 6:
                DisplayAudioBookChaptersFragment displayAudioBookChaptersFragment = (DisplayAudioBookChaptersFragment) this.receiver;
                displayAudioBookChaptersFragment.getClass();
                xn50.a.c(displayAudioBookChaptersFragment, (gdn) obj);
                return s3q0.a;
            case 7:
                mbv mbvVar = (mbv) obj;
                cbv cbvVar = (cbv) this.receiver;
                cbvVar.o.b(mbvVar);
                cbvVar.r.onNext(mbvVar);
                return s3q0.a;
            case 8:
                c310 c310Var = (c310) obj;
                com.vk.ecomm.reviews.impl.marketitem.replies.presentation.m mVar = (com.vk.ecomm.reviews.impl.marketitem.replies.presentation.m) this.receiver;
                mVar.getClass();
                Map<UserId, big0> map = c310Var.k;
                s410 s410Var = c310Var.j;
                if (c310Var.n) {
                    return p.c.b;
                }
                if (c310Var.l) {
                    return p.b.b;
                }
                sdz sdzVar = mVar.a;
                n210 n210Var = c310Var.h;
                if (n210Var == null) {
                    g = EmptyList.b;
                    str = null;
                } else {
                    ListBuilder e = e43.e();
                    boolean v = m4s.v(s410Var, Integer.valueOf(c310Var.b), null, 10);
                    if (n210Var.m) {
                        int i = n210Var.a;
                        long j = n210Var.b;
                        big0 big0Var = n210Var.d;
                        a = new g210(big0Var.a, big0Var.b, i, v, j);
                    } else {
                        a = k210.a(n210Var, 1, v, false);
                    }
                    e.add(a);
                    Collection<k4g0> values = c310Var.i.values();
                    long j2 = n210Var.b;
                    Collection<k4g0> collection = values;
                    ArrayList arrayList2 = new ArrayList(c5g.u(collection, 10));
                    for (k4g0 k4g0Var : collection) {
                        e210 e210Var = new e210(j2);
                        boolean z2 = k4g0Var.h;
                        int i2 = k4g0Var.a;
                        arrayList2.add(z2 ? hpt0.n(k4g0Var, m4s.v(s410Var, null, Integer.valueOf(i2), 4), e210Var) : gcd0.q(k4g0Var, m4s.v(s410Var, null, Integer.valueOf(i2), 4), sdzVar, e210Var));
                    }
                    str = null;
                    e.addAll(arrayList2);
                    if (c310Var.p) {
                        e.add(hig0.b);
                    }
                    if (c310Var.g > 0 && c310Var.m != null) {
                        e.add(new he90());
                    }
                    g = e.g();
                }
                List list = g;
                UserId userId2 = s410Var.d;
                UserId userId3 = s410Var.c;
                boolean z3 = (userId2 == null || userId3 == null) ? false : true;
                big0 big0Var2 = map.get(userId3);
                if (big0Var2 == null || (userId = big0Var2.a) == null || !fkq0.c(userId) || (str2 = big0Var2.d) == null) {
                    str2 = "";
                }
                String str5 = big0Var2 != null ? big0Var2.f : str;
                if (str5 == null) {
                    str5 = "";
                }
                o4g0 o4g0Var = new o4g0(userId3, false, str2, str5);
                boolean f = epx.f(userId2, c310Var.d);
                big0 big0Var3 = map.get(userId2);
                if (big0Var3 != null) {
                    str = big0Var3.g;
                }
                String str6 = str != null ? str : "";
                boolean z4 = c310Var.s;
                return new p.a(list, z3, c310Var.o, new f4g0(str6, f, z4), o4g0Var, z4, c310Var.q);
            case 9:
                ((com.vk.metrics.eventtracking.b) this.receiver).a((Throwable) obj);
                return s3q0.a;
            case 10:
                ((q9x0) this.receiver).getClass();
                List<UsersSubscriptionsItemDto> d = ((WallGetSubscriptionsExtendedResponseDto) obj).d();
                ArrayList arrayList3 = new ArrayList(c5g.u(d, 10));
                for (UsersSubscriptionsItemDto usersSubscriptionsItemDto : d) {
                    if (usersSubscriptionsItemDto instanceof UsersSubscriptionsItemDto.UsersUserFullDto) {
                        UsersSubscriptionsItemDto.UsersUserFullDto usersUserFullDto = (UsersSubscriptionsItemDto.UsersUserFullDto) usersSubscriptionsItemDto;
                        q9x0.b.getClass();
                        userProfile = new UserProfile();
                        FriendsFriendStatusStatusDto f2 = usersUserFullDto.f();
                        userProfile.v = f2 != null ? f2.i() : -1;
                        userProfile.c = usersUserFullDto.g();
                        userProfile.d = usersUserFullDto.e();
                        userProfile.f = usersUserFullDto.i();
                        userProfile.e = userProfile.d + ' ' + userProfile.f;
                        userProfile.g = usersUserFullDto.o();
                        Iterator it = e43.l(js5.a(100, usersUserFullDto.o()), usersUserFullDto.l(), usersUserFullDto.n()).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                str3 = (String) it.next();
                                if (str3 != null) {
                                }
                            } else {
                                str3 = null;
                            }
                        }
                        userProfile.h = str3;
                        UserSex.a aVar = UserSex.Companion;
                        BaseSexDto u = usersUserFullDto.u();
                        Integer valueOf = u != null ? Integer.valueOf(u.i()) : null;
                        aVar.getClass();
                        userProfile.i = UserSex.a.a(valueOf);
                        userProfile.q = usersUserFullDto.p();
                        userProfile.C = usersUserFullDto.d();
                        Serializer.c<Image> cVar = Image.CREATOR;
                        userProfile.O = Image.b.a(usersUserFullDto.o());
                        BaseBoolIntDto C = usersUserFullDto.C();
                        BaseBoolIntDto baseBoolIntDto = BaseBoolIntDto.YES;
                        boolean z5 = C == baseBoolIntDto;
                        boolean z6 = usersUserFullDto.B() == baseBoolIntDto;
                        Boolean D = usersUserFullDto.D();
                        userProfile.B.Ab(new VerifyInfo(z5, z6, D != null ? D.booleanValue() : false, false, false, false, 56, null));
                        OnlineInfo a2 = dlq0.a(usersUserFullDto.k());
                        if (a2 == null) {
                            a2 = VisibleStatus.f;
                        }
                        userProfile.n = a2;
                        FriendsRequestsMutualDto j3 = usersUserFullDto.j();
                        if (j3 != null) {
                            Integer d2 = j3.d();
                            List<UserId> e2 = j3.e();
                            if (e2 != null) {
                                List<UserId> list2 = e2;
                                arrayList = new ArrayList(c5g.u(list2, 10));
                                Iterator<T> it2 = list2.iterator();
                                while (it2.hasNext()) {
                                    arrayList.add(Long.valueOf(((UserId) it2.next()).b));
                                }
                            } else {
                                arrayList = null;
                            }
                            mutualInfo = new MutualInfo(d2, arrayList);
                        } else {
                            mutualInfo = null;
                        }
                        userProfile.d0 = mutualInfo;
                        String d3 = usersUserFullDto.d();
                        if (d3 != null) {
                            if (drm0.N(d3)) {
                                d3 = null;
                            }
                            if (d3 != null) {
                                DeactivationWithMessage.a aVar2 = new DeactivationWithMessage.a();
                                aVar2.b(d3);
                                deactivationWithMessage = aVar2.a();
                                userProfile.D = deactivationWithMessage;
                            }
                        }
                        deactivationWithMessage = null;
                        userProfile.D = deactivationWithMessage;
                    } else {
                        if (!(usersSubscriptionsItemDto instanceof UsersSubscriptionsItemDto.GroupsGroupFullDto)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        UsersSubscriptionsItemDto.GroupsGroupFullDto groupsGroupFullDto = (UsersSubscriptionsItemDto.GroupsGroupFullDto) usersSubscriptionsItemDto;
                        q9x0.c.getClass();
                        Group group = new Group();
                        group.c = groupsGroupFullDto.f();
                        group.d = groupsGroupFullDto.j();
                        String u2 = groupsGroupFullDto.u();
                        if (u2 == null) {
                            u2 = "";
                        }
                        group.h = u2;
                        String d4 = groupsGroupFullDto.d();
                        if (d4 == null) {
                            d4 = "";
                        }
                        group.z = d4;
                        BaseBoolIntDto K = groupsGroupFullDto.K();
                        BaseBoolIntDto baseBoolIntDto2 = BaseBoolIntDto.YES;
                        group.j = K == baseBoolIntDto2;
                        GroupsGroupIsClosedDto G = groupsGroupFullDto.G();
                        Integer valueOf2 = G != null ? Integer.valueOf(G.i()) : null;
                        group.m = valueOf2 != null ? valueOf2.intValue() : 0;
                        group.o = groupsGroupFullDto.e();
                        group.f = groupsGroupFullDto.p();
                        group.e = zm00.c(groupsGroupFullDto.p(), groupsGroupFullDto.o(), groupsGroupFullDto.k(), groupsGroupFullDto.l());
                        group.g = zm00.a(groupsGroupFullDto.p(), groupsGroupFullDto.o(), groupsGroupFullDto.k(), groupsGroupFullDto.l(), groupsGroupFullDto.n());
                        group.p = zm00.d(groupsGroupFullDto.D());
                        group.y.b = groupsGroupFullDto.F() == baseBoolIntDto2;
                        GroupsGroupFullMemberStatusDto i3 = groupsGroupFullDto.i();
                        group.C = i3 != null ? i3.i() : group.j ? 1 : 0;
                        group.B = groupsGroupFullDto.B();
                        UsersSubscriptionsItemDto.GroupsGroupFullDto.LeaveModeDto g2 = groupsGroupFullDto.g();
                        if (g2 != null) {
                            int i4 = f0n0.a.$EnumSwitchMapping$0[g2.ordinal()];
                            if (i4 == 1) {
                                groupLeaveMode = GroupLeaveMode.NO_MODE_ALERT;
                            } else {
                                if (i4 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                groupLeaveMode = GroupLeaveMode.OPTIONS_SELECTOR;
                            }
                        } else {
                            groupLeaveMode = null;
                        }
                        group.j0 = groupLeaveMode;
                        group.n0 = epx.f(groupsGroupFullDto.M(), Boolean.TRUE);
                        group.o0 = !epx.f(groupsGroupFullDto.C(), Boolean.FALSE) || group.j;
                        userProfile = new UserProfile(group);
                    }
                    arrayList3.add(userProfile);
                }
                return new VKList(arrayList3);
            case 11:
                PostingState postingState = (PostingState) obj;
                vpc0 vpc0Var = (vpc0) this.receiver;
                vpc0Var.getClass();
                if (!(postingState instanceof PostingState.Editing)) {
                    return gvz.d.a;
                }
                MediaPickerState mediaPickerState = ((PostingState.Editing) postingState).f;
                if (epx.f(mediaPickerState.i, Boolean.FALSE)) {
                    return gvz.c.a;
                }
                com.vk.newsfeed.posting.impl.domain.model.a aVar3 = mediaPickerState.b;
                if (!(aVar3 instanceof a.d) && (!(aVar3 instanceof a.c) || ((a.c) aVar3).a != MediaPickerPageLoadType.InitialLoad)) {
                    z = false;
                }
                if (!epx.f(mediaPickerState.i, Boolean.TRUE) || z) {
                    return gvz.d.a;
                }
                List<LocalMediaEntry> list3 = mediaPickerState.f;
                List<LocalAlbum> list4 = mediaPickerState.c;
                LocalAlbum localAlbum = list4 != null ? (LocalAlbum) j5g.a0(list4) : null;
                if ((localAlbum != null && mediaPickerState.d == localAlbum.b && localAlbum.c == 0) || localAlbum == null) {
                    return gvz.b.a;
                }
                ListBuilder e3 = e43.e();
                e3.add(fvz.b.a);
                int i5 = 0;
                for (Object obj2 : list3) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        e43.t();
                        throw null;
                    }
                    LocalMediaEntry localMediaEntry = (LocalMediaEntry) obj2;
                    boolean contains = mediaPickerState.e.contains(new MediaPickerSelectedItem.LocalMedia(localMediaEntry));
                    kvz kvzVar2 = vpc0Var.d;
                    kvzVar2.getClass();
                    boolean z7 = localMediaEntry instanceof LocalMediaEntry.Video;
                    if (z7) {
                        kvzVar = kvzVar2;
                        context = null;
                        str4 = DateUtils.formatElapsedTime(((LocalMediaEntry.Video) localMediaEntry).b.q / 1000);
                    } else {
                        kvzVar = kvzVar2;
                        context = null;
                        str4 = "";
                    }
                    Context context2 = e43.a;
                    if (context2 == null) {
                        context2 = context;
                    }
                    String b = bis.b(context2, localMediaEntry, kvzVar.a, kvzVar.b);
                    long id = localMediaEntry.ba().getId();
                    Uri f3 = localMediaEntry.ba().f();
                    Field field = mcr0.a;
                    e3.add(new fvz.a(id, localMediaEntry, contains, i5, z7, z7, str4, f3, ImageScreenSize.SMALL, b, contains ? R.drawable.vk_icon_check_circle_shadow_40 : R.drawable.vk_icon_circle_outline_shadow_40, contains ? y8g0.e(R.string.media_item_checked_checkbox_content_description) : y8g0.e(R.string.media_item_unchecked_checkbox_content_description)));
                    i5 = i6;
                }
                return new gvz.a(e3.g());
            default:
                ((pww0) this.receiver).getClass();
                pww0.U((Throwable) obj);
                return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jnb(Object obj, int i) {
        super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
        this.b = i;
        switch (i) {
            case 1:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            default:
                break;
            case 7:
                super(1, obj, cbv.class, "accept", "accept(Lcom/vk/voip/ui/holiday_interaction/view/HolidayInteractionViewModel;)V", 0);
                break;
            case 8:
                super(1, obj, com.vk.ecomm.reviews.impl.marketitem.replies.presentation.m.class, "map", "map(Lcom/vk/ecomm/reviews/impl/marketitem/replies/presentation/MarketItemReviewRepliesState;)Lcom/vk/ecomm/reviews/impl/marketitem/replies/presentation/MarketItemReviewRepliesViewState;", 0);
                break;
            case 9:
                super(1, obj, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0);
                break;
            case 10:
                super(1, obj, q9x0.class, "map", "map(Lcom/vk/api/generated/wall/dto/WallGetSubscriptionsExtendedResponseDto;)Lcom/vk/dto/common/data/VKList;", 0);
                break;
            case 11:
                super(1, obj, vpc0.class, "mapLocalMediaState", "mapLocalMediaState(Lcom/vk/newsfeed/posting/impl/domain/model/PostingState;)Lcom/vk/newsfeed/posting/impl/presentation/model/LocalMediaListViewState;", 0);
                break;
            case 12:
                super(1, obj, pww0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0);
                break;
        }
    }
}
