package xsna;

import android.content.Context;
import com.vk.core.apps.BuildInfo;
import com.vk.menu.presentation.entity.MenuItemUiData;
import com.vkontakte.android.R;

/* compiled from: SuperAppMenuImpl.kt */
/* loaded from: classes6.dex */
public final class o9n0 implements m9n0 {
    public static Integer g(String str) {
        MenuItemUiData menuItemUiData;
        MenuItemUiData[] values = MenuItemUiData.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                menuItemUiData = null;
                break;
            }
            menuItemUiData = values[i];
            if (epx.f(menuItemUiData.i(), str)) {
                break;
            }
            i++;
        }
        if (menuItemUiData != null) {
            return Integer.valueOf(menuItemUiData.h());
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0052, code lost:
    
        if (r9.equals("bugs") == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0099, code lost:
    
        r0 = java.lang.Integer.valueOf(com.vkontakte.android.R.drawable.vk_icon_bug_outline_28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0096, code lost:
    
        if (r9.equals("bug_tracker") == false) goto L42;
     */
    @Override // xsna.m9n0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(String str) {
        Integer num;
        switch (str.hashCode()) {
            case -1854767153:
                if (str.equals("support")) {
                    num = Integer.valueOf(R.drawable.vk_icon_help_circle_outline_28);
                    break;
                }
                num = null;
                break;
            case -1718204307:
                break;
            case -814969826:
                if (str.equals("vk_pay")) {
                    num = Integer.valueOf(R.drawable.vk_icon_money_circle_outline_28);
                    break;
                }
                num = null;
                break;
            case -648349216:
                if (str.equals("qr_scanner")) {
                    num = Integer.valueOf(R.drawable.vk_icon_qr_code_outline_28);
                    break;
                }
                num = null;
                break;
            case -274828254:
                if (str.equals("switch_account")) {
                    num = Integer.valueOf(R.drawable.vk_icon_switch_outline_28);
                    break;
                }
                num = null;
                break;
            case 96432:
                if (str.equals(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS)) {
                    num = Integer.valueOf(R.drawable.vk_icon_advertising_outline_28);
                    break;
                }
                num = null;
                break;
            case 3035263:
                break;
            case 95458899:
                if (str.equals("debug")) {
                    num = Integer.valueOf(R.drawable.vk_icon_new_logo_vk_outline_28);
                    break;
                }
                num = null;
                break;
            case 141981839:
                if (str.equals("add_account")) {
                    num = Integer.valueOf(R.drawable.vk_icon_add_outline_28);
                    break;
                }
                num = null;
                break;
            case 1951436805:
                if (str.equals("expert_card")) {
                    num = Integer.valueOf(R.drawable.vk_icon_brain_outline_28);
                    break;
                }
                num = null;
                break;
            default:
                num = null;
                break;
        }
        if (num != null) {
            return num.intValue();
        }
        Integer g = g(str);
        if (g != null) {
            int intValue = g.intValue();
            com.vk.menu.presentation.entity.a aVar = com.vk.menu.presentation.entity.a.a;
            if (intValue == MenuItemUiData.PROFILE.h()) {
                return R.drawable.vk_icon_user_circle_outline_28;
            }
            if (intValue == MenuItemUiData.FRIENDS.h()) {
                return R.drawable.vk_icon_users_outline_28;
            }
            if (intValue == MenuItemUiData.GROUPS.h()) {
                return R.drawable.vk_icon_users_3_outline_28;
            }
            if (intValue == MenuItemUiData.VK_CALLS.h()) {
                return R.drawable.vk_icon_phone_outline_28;
            }
            if (intValue == MenuItemUiData.FAVES.h()) {
                return R.drawable.vk_icon_bookmark_outline_28;
            }
            if (intValue == MenuItemUiData.SEARCH.h()) {
                return R.drawable.vk_icon_search_outline_28;
            }
            if (intValue == MenuItemUiData.SETTINGS.h()) {
                return R.drawable.vk_icon_settings_outline_28;
            }
            if (intValue == MenuItemUiData.EXPERT_CARD.h()) {
                return R.drawable.vk_icon_brain_outline_28;
            }
            if (intValue == MenuItemUiData.STICKERS.h()) {
                return R.drawable.vk_icon_smile_outline_28;
            }
            if (intValue == MenuItemUiData.DOCUMENTS.h()) {
                return R.drawable.vk_icon_document_outline_28;
            }
            if (intValue == MenuItemUiData.SUPPORT.h()) {
                return R.drawable.vk_icon_help_outline_28;
            }
            if (intValue == MenuItemUiData.PAYMENTS.h()) {
                return R.drawable.vk_icon_money_transfer_outline_28;
            }
            if (intValue == MenuItemUiData.AUDIOS.h()) {
                return R.drawable.vk_icon_music_outline_28;
            }
            if (intValue == MenuItemUiData.MARKET.h()) {
                return R.drawable.vk_icon_market_outline_28;
            }
            if (intValue == MenuItemUiData.LIVES.h()) {
                return R.drawable.vk_icon_live_outline_28;
            }
            if (intValue == MenuItemUiData.GAMES.h()) {
                return R.drawable.vk_icon_game_outline_28;
            }
            if (intValue == MenuItemUiData.PODCASTS.h()) {
                return R.drawable.vk_icon_podcast_outline_28;
            }
            if (intValue == MenuItemUiData.ARCHIVE.h()) {
                return R.drawable.vk_icon_archive_outline_28;
            }
            if (intValue == MenuItemUiData.MEMORIES.h()) {
                return R.drawable.vk_icon_history_backward_outline_28;
            }
            if (intValue == MenuItemUiData.WISHLIST.h()) {
                return R.drawable.vk_icon_list_like_outline_28;
            }
            if (intValue == MenuItemUiData.FEED_LIKES.h()) {
                return R.drawable.vk_icon_like_outline_28;
            }
            if (intValue == MenuItemUiData.STATS.h()) {
                return R.drawable.vk_icon_statistics_outline_28;
            }
            if (intValue == MenuItemUiData.ADS_EASY_PROMOTE.h()) {
                return R.drawable.vk_icon_advertising_outline_28;
            }
            if (intValue == MenuItemUiData.ADD_ACCOUNT.h()) {
                return R.drawable.vk_icon_add_outline_28;
            }
            if (intValue == MenuItemUiData.SWITCH_ACCOUNT.h()) {
                return R.drawable.vk_icon_switch_outline_28;
            }
            if (intValue == MenuItemUiData.QR_SCANNER.h()) {
                return R.drawable.vk_icon_qr_code_outline_28;
            }
            Context context = e43.a;
            String b = gbg0.b((context != null ? context : null).getResources(), intValue);
            com.vk.metrics.eventtracking.b.a.a(new IllegalArgumentException("Unknown menu item id: '" + b + "' (" + intValue + ')'));
        }
        return 0;
    }

    @Override // xsna.m9n0
    public final int b(String str) {
        Integer g = g(str);
        if (g == null) {
            return 0;
        }
        int intValue = g.intValue();
        com.vk.menu.presentation.entity.a aVar = com.vk.menu.presentation.entity.a.a;
        return com.vk.menu.presentation.entity.a.g(intValue);
    }

    @Override // xsna.m9n0
    public final boolean c(ww50<?> ww50Var, String str) {
        Integer g = g(str);
        if (g == null) {
            return false;
        }
        m820.c(ww50Var, g.intValue(), true);
        return true;
    }

    @Override // xsna.m9n0
    public final boolean d(String str) {
        Integer g = g(str);
        if (g == null) {
            return false;
        }
        int intValue = g.intValue();
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        return m820.b(intValue, context, true);
    }

    @Override // xsna.m9n0
    public final String e(Context context, String str) {
        int i;
        if (str.equals("debug")) {
            StringBuilder sb = new StringBuilder("v");
            sb.append(BuildInfo.d);
            sb.append(" (");
            return vu5.b(sb, BuildInfo.e, ')');
        }
        Integer g = g(str);
        if (g == null) {
            return null;
        }
        int intValue = g.intValue();
        com.vk.menu.presentation.entity.a aVar = com.vk.menu.presentation.entity.a.a;
        if (intValue == MenuItemUiData.PROFILE.h()) {
            i = R.string.menu_my_profile;
        } else if (intValue == MenuItemUiData.FRIENDS.h()) {
            i = R.string.friends;
        } else if (intValue == MenuItemUiData.GROUPS.h()) {
            i = R.string.groups;
        } else if (intValue == MenuItemUiData.VK_CALLS.h()) {
            i = R.string.calls;
        } else if (intValue == MenuItemUiData.FAVES.h()) {
            i = R.string.fave_title;
        } else if (intValue == MenuItemUiData.SEARCH.h()) {
            i = R.string.search;
        } else if (intValue == MenuItemUiData.SETTINGS.h()) {
            i = R.string.menu_settings;
        } else if (intValue == MenuItemUiData.EXPERT_CARD.h()) {
            i = R.string.right_menu_topic_expert;
        } else if (intValue == MenuItemUiData.STICKERS.h()) {
            i = R.string.stickers;
        } else if (intValue == MenuItemUiData.DOCUMENTS.h()) {
            i = R.string.docs;
        } else if (intValue == MenuItemUiData.SUPPORT.h()) {
            i = R.string.help;
        } else if (intValue == MenuItemUiData.PAYMENTS.h()) {
            i = R.string.money_transfer_money_transfers;
        } else if (intValue == MenuItemUiData.AUDIOS.h()) {
            i = R.string.music;
        } else if (intValue == MenuItemUiData.MARKET.h()) {
            i = R.string.vk_shopping;
        } else if (intValue == MenuItemUiData.LIVES.h()) {
            i = R.string.sett_live;
        } else if (intValue == MenuItemUiData.GAMES.h()) {
            i = R.string.games;
        } else if (intValue == MenuItemUiData.PODCASTS.h()) {
            i = R.string.podcasts;
        } else if (intValue == MenuItemUiData.ARCHIVE.h()) {
            i = R.string.story_archive;
        } else if (intValue == MenuItemUiData.MEMORIES.h()) {
            i = R.string.right_menu_memories;
        } else if (intValue == MenuItemUiData.WISHLIST.h()) {
            i = R.string.wishlist;
        } else if (intValue == MenuItemUiData.FEED_LIKES.h()) {
            i = R.string.sett_reactions;
        } else if (intValue == MenuItemUiData.STATS.h()) {
            i = R.string.right_menu_statistics;
        } else if (intValue == MenuItemUiData.ADS_EASY_PROMOTE.h()) {
            i = R.string.ads_easy_promote_title;
        } else if (intValue == MenuItemUiData.BUGS.h()) {
            i = R.string.menu_bugs;
        } else if (intValue == MenuItemUiData.ADD_ACCOUNT.h()) {
            i = R.string.vk_multiaccount_add_account;
        } else if (intValue == MenuItemUiData.SWITCH_ACCOUNT.h()) {
            i = R.string.vk_multiaccount_switch_account;
        } else if (intValue == MenuItemUiData.QR_SCANNER.h()) {
            i = R.string.menu_qr_scanner;
        } else if (intValue == MenuItemUiData.VK_PAY.h()) {
            i = R.string.menu_vkpay;
        } else {
            Context context2 = e43.a;
            String b = gbg0.b((context2 != null ? context2 : null).getResources(), intValue);
            com.vk.metrics.eventtracking.b.a.a(new IllegalArgumentException("Unknown menu item id: '" + b + "' (" + intValue + ')'));
            i = 0;
        }
        return context.getString(i);
    }

    @Override // xsna.m9n0
    public final dlj0 f() {
        b68 b68Var = b68.b;
        if (b68.d == null) {
            b68Var.m();
        }
        dlj0 dlj0Var = b68.d;
        return dlj0Var == null ? b68.e().a().b().d : dlj0Var;
    }
}
