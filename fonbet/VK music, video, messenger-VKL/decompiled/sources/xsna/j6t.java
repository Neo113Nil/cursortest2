package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.photo.Photo;
import com.vk.imageloader.view.VKImageView;
import com.vk.superapp.ui.VkNotificationBadgeView;
import com.vkontakte.android.R;
import java.util.WeakHashMap;
import kotlin.Pair;
import me.grishka.appkit.views.UsableRecyclerView;

/* compiled from: GameAppHolder.java */
@Deprecated
/* loaded from: classes17.dex */
public final class j6t extends vif0<ApiApplication> implements UsableRecyclerView.e, View.OnClickListener {
    public static final /* synthetic */ int t = 0;
    public final VKImageView n;
    public final TextView o;
    public final TextView p;
    public final TextView q;
    public final VkNotificationBadgeView r;

    @NonNull
    public final String s;

    public j6t(@NonNull ViewGroup viewGroup, @NonNull String str) {
        super(viewGroup, R.layout.installed_apps_item, 0);
        this.s = str;
        this.n = (VKImageView) this.itemView.findViewById(R.id.app_icon);
        this.o = (TextView) this.itemView.findViewById(R.id.app_title);
        this.p = (TextView) this.itemView.findViewById(R.id.app_subtitle);
        this.q = (TextView) this.itemView.findViewById(R.id.app_bubble);
        this.r = (VkNotificationBadgeView) this.itemView.findViewById(R.id.notification_badge_view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0026, code lost:
    
        if (r4 == null) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0104  */
    @Override // xsna.vif0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i6(ApiApplication apiApplication) {
        Context context;
        boolean z;
        String str;
        VkNotificationBadgeView.BadgeType badgeType;
        ApiApplication apiApplication2 = apiApplication;
        this.o.setText(apiApplication2.c);
        this.p.setText(apiApplication2.g);
        VkNotificationBadgeView vkNotificationBadgeView = this.r;
        TextView textView = this.q;
        if (vkNotificationBadgeView == null || (context = vkNotificationBadgeView.getContext()) == null) {
            context = textView != null ? textView.getContext() : null;
        }
        if (textView != null) {
            String str2 = apiApplication2.n;
            boolean z2 = str2 == null || drm0.N(str2);
            if (apiApplication2.p || !z2) {
                Pair pair = !z2 ? new Pair(apiApplication2.n, Integer.valueOf(R.drawable.vk_games_app_item_badge_red)) : new Pair(context.getString(R.string.vk_games_new_badge), Integer.valueOf(R.drawable.vk_games_app_item_badge));
                String str3 = (String) pair.d();
                textView.setBackground(m33.a(((Number) pair.g()).intValue(), context));
                textView.setText(str3);
                if (!bwt0.K(textView)) {
                    bwt0.p0(textView, true);
                }
                z = true;
                str = apiApplication2.o;
                if (str != null) {
                    int hashCode = str.hashCode();
                    if (hashCode != -1572310012) {
                        if (hashCode != 1245765277) {
                            if (hashCode == 2130114069 && str.equals("notification_discount")) {
                                badgeType = VkNotificationBadgeView.BadgeType.DISCOUNT;
                                if (z && vkNotificationBadgeView != null && badgeType != null) {
                                    vkNotificationBadgeView.setVisibility(0);
                                    int i = VkNotificationBadgeView.b.$EnumSwitchMapping$0[badgeType.ordinal()];
                                    if (i == 1) {
                                        vkNotificationBadgeView.setImageDrawable(vkNotificationBadgeView.c);
                                    } else if (i == 2) {
                                        vkNotificationBadgeView.setImageDrawable(vkNotificationBadgeView.d);
                                    } else if (i != 3) {
                                        vkNotificationBadgeView.setImageDrawable(null);
                                    } else {
                                        vkNotificationBadgeView.setImageDrawable(vkNotificationBadgeView.e);
                                    }
                                } else if (vkNotificationBadgeView != null) {
                                    f4m.j(vkNotificationBadgeView);
                                }
                            }
                        } else if (str.equals("notification_update")) {
                            badgeType = VkNotificationBadgeView.BadgeType.UPDATE;
                            if (z) {
                            }
                            if (vkNotificationBadgeView != null) {
                            }
                        }
                    } else if (str.equals("notification_gift")) {
                        badgeType = VkNotificationBadgeView.BadgeType.GIFT;
                        if (z) {
                        }
                        if (vkNotificationBadgeView != null) {
                        }
                    }
                    Photo photo = apiApplication2.d;
                    WeakHashMap weakHashMap = j6r0.a;
                    this.n.load(photo.Fb(iah0.a(72.0f), false).d.d);
                }
                badgeType = null;
                if (z) {
                }
                if (vkNotificationBadgeView != null) {
                }
                Photo photo2 = apiApplication2.d;
                WeakHashMap weakHashMap2 = j6r0.a;
                this.n.load(photo2.Fb(iah0.a(72.0f), false).d.d);
            }
            if (bwt0.K(textView)) {
                bwt0.p0(textView, false);
            }
        }
        z = false;
        str = apiApplication2.o;
        if (str != null) {
        }
        badgeType = null;
        if (z) {
        }
        if (vkNotificationBadgeView != null) {
        }
        Photo photo22 = apiApplication2.d;
        WeakHashMap weakHashMap22 = j6r0.a;
        this.n.load(photo22.Fb(iah0.a(72.0f), false).d.d);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        onClick();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // me.grishka.appkit.views.UsableRecyclerView.e
    public final void onClick() {
        k8t.a(this.itemView.getContext(), (ApiApplication) this.m, this.s);
    }
}
