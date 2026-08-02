package xsna;

import android.content.Context;
import com.vk.profile.community.impl.ui.tag.CommunityActionTags;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

/* compiled from: CommunityButtonItemFactory.kt */
/* loaded from: classes5.dex */
public final class ctg {
    public final Context a;
    public int b;

    public ctg(Context context) {
        this.a = context;
    }

    public final ArrayList a(ExtendedCommunityProfile extendedCommunityProfile) {
        epg epgVar;
        epg epgVar2;
        epg b;
        epg b2;
        epg epgVar3;
        epg b3;
        int i = extendedCommunityProfile.a0;
        int i2 = R.drawable.vk_icon_add_square_outline_20;
        Context context = this.a;
        if (i >= 2) {
            this.b = 0;
            ArrayList arrayList = new ArrayList(3);
            int i3 = extendedCommunityProfile.a1;
            if (i3 == 1 || i3 == 2 || i3 == 4) {
                epgVar3 = null;
            } else {
                int i4 = extendedCommunityProfile.Y;
                epgVar3 = new epg(context.getString(i4 == 1 ? R.string.community_status_button_join_event : i4 == 2 ? R.string.join_page : R.string.join_group_short), CommunityActionTags.JOIN_POPUP, null, new dpg(R.drawable.vk_icon_add_square_outline_20, e()), 0, false, false, 116);
            }
            if (epgVar3 != null) {
                d(arrayList.add(epgVar3));
            }
            r9 = extendedCommunityProfile.k2 ? new epg(context.getString(R.string.community_admin_action_button_messages), CommunityActionTags.ADMIN_MESSAGES, null, new dpg(R.drawable.vk_icon_message_outline_20, R.attr.vk_ui_text_accent_themed), extendedCommunityProfile.i2, false, false, 68) : null;
            if (r9 != null) {
                d(arrayList.add(r9));
            }
            epg c = c(extendedCommunityProfile);
            if (c != null) {
                d(arrayList.add(c));
            }
            if (arrayList.size() < 3 && (b3 = b(extendedCommunityProfile)) != null) {
                d(arrayList.add(b3));
            }
            return arrayList;
        }
        this.b = 0;
        ArrayList arrayList2 = new ArrayList(3);
        if (bwd0.h(extendedCommunityProfile) && (xa4.B(extendedCommunityProfile.a1) || extendedCommunityProfile.z1 == null)) {
            epgVar = new epg(context.getString(xa4.y(extendedCommunityProfile)), CommunityActionTags.JOIN_POPUP, null, new dpg(extendedCommunityProfile.a1 == 4 ? R.drawable.vk_icon_arrow_right_square_outline_20 : R.drawable.vk_icon_add_square_outline_20, e()), 0, false, false, 116);
        } else {
            epgVar = null;
        }
        if (epgVar != null) {
            d(arrayList2.add(epgVar));
        }
        if (extendedCommunityProfile.a1 != 4) {
            epgVar2 = null;
        } else {
            int y = xa4.y(extendedCommunityProfile);
            if (extendedCommunityProfile.a1 == 4) {
                i2 = R.drawable.vk_icon_arrow_right_square_outline_20;
            }
            epgVar2 = new epg(context.getString(y), CommunityActionTags.OPTIONS, null, new dpg(i2, R.attr.vk_ui_text_accent_themed), 0, true, false, 84);
        }
        if (epgVar2 != null) {
            d(arrayList2.add(epgVar2));
        }
        boolean z = extendedCommunityProfile.P2;
        if (z && (b2 = b(extendedCommunityProfile)) != null) {
            d(arrayList2.add(b2));
        }
        if (extendedCommunityProfile.j2 != null) {
            epg c2 = c(extendedCommunityProfile);
            if (c2 != null) {
                arrayList2.add(c2);
                return arrayList2;
            }
        } else {
            if (extendedCommunityProfile.e0) {
                dpg dpgVar = new dpg(R.drawable.vk_icon_message_outline_20, e());
                r9 = new epg(context.getString(R.string.message), CommunityActionTags.MESSAGE, this.b < 2 ? null : dpgVar, dpgVar, 0, false, false, 112);
            }
            if (r9 != null) {
                d(arrayList2.add(r9));
            }
            if (!z && (b = b(extendedCommunityProfile)) != null) {
                d(arrayList2.add(b));
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0098, code lost:
    
        if (r0.intValue() != 7) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final epg b(ExtendedCommunityProfile extendedCommunityProfile) {
        int i;
        if (!bwd0.b(extendedCommunityProfile) && extendedCommunityProfile.X1 != null) {
            Set singleton = Collections.singleton(-1);
            ja9 ja9Var = extendedCommunityProfile.X1;
            if (!j5g.P(singleton, ja9Var != null ? Integer.valueOf(ja9Var.a) : null)) {
                ja9 ja9Var2 = extendedCommunityProfile.X1;
                Integer valueOf = ja9Var2 != null ? Integer.valueOf(ja9Var2.a) : null;
                if (valueOf != null && valueOf.intValue() == 0) {
                    i = R.drawable.vk_icon_mail_outline_20;
                } else if ((valueOf != null && valueOf.intValue() == 1) || (valueOf != null && valueOf.intValue() == 2)) {
                    i = R.drawable.vk_icon_phone_outline_20;
                } else {
                    if ((valueOf == null || valueOf.intValue() != 3) && ((valueOf == null || valueOf.intValue() != 4) && (valueOf == null || valueOf.intValue() != 5))) {
                        if (valueOf != null && valueOf.intValue() == 6) {
                            if (!extendedCommunityProfile.P2) {
                                i = R.drawable.vk_icon_square_4_outline_20;
                            }
                        } else if (valueOf != null) {
                        }
                        i = R.drawable.vk_icon_calendar_outline_20;
                    }
                    i = R.drawable.vk_icon_link_circle_outline_20;
                }
                dpg dpgVar = new dpg(i, e());
                ja9 ja9Var3 = extendedCommunityProfile.X1;
                return new epg(ja9Var3 != null ? ja9Var3.b : null, CommunityActionTags.CALL_TO_ACTION, this.b < 2 ? null : dpgVar, dpgVar, 0, false, extendedCommunityProfile.P2, 48);
            }
        }
        return null;
    }

    public final epg c(ExtendedCommunityProfile extendedCommunityProfile) {
        if (extendedCommunityProfile.j2 == null) {
            return null;
        }
        return new epg(this.a.getString(R.string.community_admin_action_button_promotion), CommunityActionTags.ADMIN_PROMOTION, null, new dpg(R.drawable.vk_icon_advertising_outline_20, e()), 0, false, false, 116);
    }

    public final void d(boolean z) {
        if (z) {
            this.b++;
        }
    }

    public final int e() {
        return this.b < 1 ? R.attr.vk_ui_text_contrast_themed : R.attr.vk_ui_text_accent_themed;
    }
}
