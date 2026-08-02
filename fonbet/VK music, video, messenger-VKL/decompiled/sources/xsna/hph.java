package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.profile.community.impl.ui.profile.actions.d;
import com.vk.profile.community.impl.ui.profile.d;
import com.vk.repository.data.api.ExtendedProfilesRepository;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.functions.a;
import kotlin.NoWhenBranchMatchedException;
import xsna.z4h;

/* compiled from: CommunityProfileInternalMenuFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class hph {
    public final sdz a;
    public final sec b;
    public final UserId c;
    public final ExtendedProfilesRepository d;
    public final io.reactivex.rxjava3.disposables.b e;
    public final foh f;
    public final z4f g;

    /* compiled from: CommunityProfileInternalMenuFeatureDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CommunityProfileAction.CommunityInternalMenuAction.CommunityMenuActionType.values().length];
            try {
                iArr[CommunityProfileAction.CommunityInternalMenuAction.CommunityMenuActionType.CLICK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommunityProfileAction.CommunityInternalMenuAction.CommunityMenuActionType.LONG_CLICK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CommunityProfileAction.CommunityInternalMenuAction.CommunityMenuActionType.COPY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CommunityProfileAction.CommunityInternalMenuAction.CommunityMenuActionType.SHARE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CommunityProfileAction.CommunityInternalMenuAction.CommunityMenuActionType.EDIT_ITEM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CommunityProfileAction.CommunityInternalMenuAction.CommunityMenuActionType.DELETE_ITEM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CommunityProfileAction.CommunityInternalMenuAction.CommunityMenuActionType.HIDE_APP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CommunityProfileAction.CommunityInternalMenuAction.CommunityMenuActionType.UNHIDE_APP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CommunityProfileAction.CommunityInternalMenuAction.CommunityMenuActionType.ADD_NEW_ITEM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[CommunityProfileAction.CommunityInternalMenuAction.CommunityMenuActionType.EDIT_ORDER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[CommunityProfileAction.CommunityInternalMenuAction.CommunityMenuActionType.HIDE_MENU.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[CommunityProfileAction.CommunityInternalMenuAction.CommunityMenuActionType.OPEN_MENU.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[CommunityProfileAction.CommunityInternalMenuAction.CommunityMenuActionType.VIEW.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CommunityProfileAction.MiniAppMenuResultSnackBar.MenuSnackBarType.values().length];
            try {
                iArr2[CommunityProfileAction.MiniAppMenuResultSnackBar.MenuSnackBarType.REORDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[CommunityProfileAction.MiniAppMenuResultSnackBar.MenuSnackBarType.ADD_ITEM.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[CommunityProfileAction.MiniAppMenuResultSnackBar.MenuSnackBarType.EDIT_ITEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public hph(sdz sdzVar, sec secVar, UserId userId, ExtendedProfilesRepository extendedProfilesRepository, io.reactivex.rxjava3.disposables.b bVar, foh fohVar, z4f z4fVar) {
        this.a = sdzVar;
        this.b = secVar;
        this.c = userId;
        this.d = extendedProfilesRepository;
        this.e = bVar;
        this.f = fohVar;
        this.g = z4fVar;
    }

    public static void c(final hph hphVar, io.reactivex.rxjava3.core.a aVar, final int i, int i2, final d.j jVar, final Integer num, int i3) {
        if ((i3 & 16) != 0) {
            num = null;
        }
        defpackage.n nVar = new defpackage.n(new eph(hphVar, 0), 19);
        aVar.getClass();
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        hphVar.e.b(new io.reactivex.rxjava3.internal.operators.completable.w(aVar, nVar, lVar, kVar, kVar, kVar, kVar).j(new h53(hphVar, 1)).subscribe(new io.reactivex.rxjava3.functions.a() { // from class: xsna.fph
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                hph hphVar2 = hph.this;
                hphVar2.f.invoke(jVar);
                hphVar2.b.invoke(new d.c.b(i, 4, num));
            }
        }, new sv(new gph(hphVar, i2), 22)));
    }

    public final void a(CommunityProfileAction.CommunityInternalMenuAction communityInternalMenuAction) {
        String str;
        z4h.a aVar = communityInternalMenuAction.c;
        CommunityProfileAction.CommunityInternalMenuAction.CommunityMenuActionType communityMenuActionType = communityInternalMenuAction.b;
        int[] iArr = a.$EnumSwitchMapping$0;
        int i = iArr[communityMenuActionType.ordinal()];
        ExtendedProfilesRepository extendedProfilesRepository = this.d;
        UserId userId = this.c;
        sec secVar = this.b;
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                String y = (aVar == null || (str = aVar.d) == null) ? null : brm0.y(str, "&amp;", "&");
                if (y == null || drm0.N(y) || !this.a.g(y)) {
                    return;
                }
                int i2 = iArr[communityMenuActionType.ordinal()];
                if (i2 == 1) {
                    secVar.invoke(new d.j.v.C1604d(y));
                    return;
                }
                if (i2 == 2) {
                    secVar.invoke(new d.j.v.C1604d(y));
                    return;
                } else if (i2 == 3) {
                    secVar.invoke(new d.AbstractC1593d.a(y));
                    return;
                } else {
                    if (i2 != 4) {
                        return;
                    }
                    secVar.invoke(new d.j.v.f(y));
                    return;
                }
            case 5:
            case 6:
            case 7:
            case 8:
                if (aVar != null) {
                    int i3 = aVar.a;
                    int i4 = iArr[communityMenuActionType.ordinal()];
                    if (i4 == 5) {
                        secVar.invoke(new d.j.v.b(i3, userId));
                        return;
                    }
                    if (i4 == 6) {
                        c(this, extendedProfilesRepository.l(i3, userId), R.string.community_menu_delete_item_result_success, R.string.community_menu_delete_item_result_failed, new d.j.b(i3), null, 48);
                        return;
                    } else if (i4 == 7) {
                        c(this, extendedProfilesRepository.T(i3, userId), R.string.community_menu_hide_item_result_success, R.string.community_menu_hide_item_result_failed, new d.j.c(i3, true), Integer.valueOf(R.string.community_menu_hide_item_result_success_description), 32);
                        return;
                    } else {
                        if (i4 != 8) {
                            return;
                        }
                        c(this, extendedProfilesRepository.P(i3, userId), R.string.community_menu_unhide_item_result_success, R.string.community_menu_unhide_item_result_failed, new d.j.c(i3, false), null, 48);
                        return;
                    }
                }
                return;
            case 9:
                if (((Boolean) this.g.invoke()).booleanValue()) {
                    secVar.invoke(new d.j.v.a(userId));
                    return;
                } else {
                    secVar.invoke(new d.c.a(R.string.community_menu_add_item_result_failed_max_items, 4, Integer.valueOf(R.string.community_menu_add_item_result_failed_description_max_items)));
                    return;
                }
            case 10:
                secVar.invoke(new d.j.v.c(userId));
                return;
            case 11:
                c(this, extendedProfilesRepository.b0(userId), R.string.community_menu_hide_menu_result_success, R.string.community_menu_hide_menu_result_failed, d.j.a.b, Integer.valueOf(R.string.community_menu_hide_menu_result_success_description), 32);
                return;
            case 12:
                secVar.invoke(new d.j.v.e(userId));
                return;
            case 13:
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void b(CommunityProfileAction.MiniAppMenuResultSnackBar miniAppMenuResultSnackBar) {
        int i;
        int i2;
        CommunityProfileAction.MiniAppMenuResultSnackBar.MenuSnackBarType menuSnackBarType = miniAppMenuResultSnackBar.b;
        boolean z = miniAppMenuResultSnackBar.c;
        sec secVar = this.b;
        if (z) {
            int i3 = a.$EnumSwitchMapping$1[menuSnackBarType.ordinal()];
            if (i3 == 1) {
                i2 = R.string.community_menu_reorder_result_success;
            } else if (i3 == 2) {
                i2 = R.string.community_menu_add_item_result_success;
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = R.string.community_menu_edit_item_result_success;
            }
            secVar.invoke(new d.c.b(i2, 6, null));
            return;
        }
        int i4 = a.$EnumSwitchMapping$1[menuSnackBarType.ordinal()];
        if (i4 == 1) {
            i = R.string.community_menu_reorder_result_failed;
        } else if (i4 == 2) {
            i = R.string.community_menu_add_item_result_failed;
        } else {
            if (i4 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.string.community_menu_edit_item_result_failed;
        }
        secVar.invoke(new d.c.a(i, 6, null));
    }
}
