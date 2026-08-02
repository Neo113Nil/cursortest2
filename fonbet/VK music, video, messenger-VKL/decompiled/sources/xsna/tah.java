package xsna;

import android.content.Context;
import android.text.Html;
import android.text.Spanned;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.cell.rich.VkRichCell;
import com.vk.profile.community.details.api.name_history.data.dto.CommunityNameHistoryAction;
import com.vkontakte.android.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import kotlin.NoWhenBranchMatchedException;
import xsna.k1u0;
import xsna.ngv0;
import xsna.tlo0;

/* compiled from: CommunityNameHistoryItemViewHolder.kt */
/* loaded from: classes5.dex */
public final class tah extends vfz<uah> {
    public final VkRichCell l;
    public final SimpleDateFormat m;
    public final sah n;

    /* compiled from: CommunityNameHistoryItemViewHolder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CommunityNameHistoryAction.values().length];
            try {
                iArr[CommunityNameHistoryAction.RENAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommunityNameHistoryAction.COLLAPSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CommunityNameHistoryAction.CREATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public tah(VkRichCell vkRichCell, SimpleDateFormat simpleDateFormat) {
        super(vkRichCell);
        this.l = vkRichCell;
        this.m = simpleDateFormat;
        this.n = new sah();
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(uah uahVar) {
        int i;
        String string;
        String string2;
        uah uahVar2 = uahVar;
        String str = uahVar2.c;
        CommunityNameHistoryAction communityNameHistoryAction = uahVar2.b;
        int[] iArr = a.$EnumSwitchMapping$0;
        int i2 = iArr[communityNameHistoryAction.ordinal()];
        if (i2 == 1 || i2 == 2) {
            i = R.drawable.vk_icon_history_backward_outline_24;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.drawable.vk_icon_flapper_20;
        }
        int i3 = i;
        String escapeHtml = Html.escapeHtml(str);
        int i4 = iArr[communityNameHistoryAction.ordinal()];
        if (i4 == 1) {
            string = this.itemView.getContext().getString(R.string.community_name_history_title_renamed, escapeHtml);
        } else if (i4 == 2) {
            Context context = this.itemView.getContext();
            Context context2 = this.itemView.getContext();
            Integer g = cqm0.g(escapeHtml);
            string = context.getString(R.string.community_name_history_title_collapse, context2.getResources().getQuantityString(R.plurals.community_name_history_times, g != null ? g.intValue() : 1, escapeHtml));
        } else {
            if (i4 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            string = str.length() == 0 ? this.itemView.getContext().getString(R.string.community_name_history_title_created_no_title) : this.itemView.getContext().getString(R.string.community_name_history_title_created, escapeHtml);
        }
        Spanned fromHtml = Html.fromHtml(string, 63, null, this.n);
        Date date = new Date(uahVar2.d * 1000);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Date date2 = new Date();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);
        if (c09.c(calendar2, calendar) && (communityNameHistoryAction == CommunityNameHistoryAction.CREATE || communityNameHistoryAction == CommunityNameHistoryAction.RENAME)) {
            string2 = this.itemView.getContext().getString(R.string.community_name_history_description_today);
        } else {
            Calendar calendar3 = Calendar.getInstance();
            calendar3.setTime(date);
            Date date3 = new Date();
            Calendar calendar4 = Calendar.getInstance();
            calendar4.setTime(date3);
            if (c09.f(calendar4, calendar3) && (communityNameHistoryAction == CommunityNameHistoryAction.CREATE || communityNameHistoryAction == CommunityNameHistoryAction.RENAME)) {
                string2 = this.itemView.getContext().getString(R.string.community_name_history_description_yesterday);
            } else {
                String format = this.m.format(date);
                int i5 = iArr[communityNameHistoryAction.ordinal()];
                if (i5 != 1) {
                    if (i5 == 2) {
                        string2 = this.itemView.getContext().getString(R.string.community_name_history_description_collapse, format);
                    } else if (i5 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                string2 = this.itemView.getContext().getString(R.string.community_name_history_date_with_year_letter, format);
            }
        }
        VkCell.Left.b bVar = new VkCell.Left.b(new VkCell.Left.Main.c(i3, VkCell.Left.Main.Size.Small, new k1u0.a(new x7g(R.attr.vk_ui_icon_secondary)), (tlo0.h) null, 8), null);
        VkRichCell vkRichCell = this.l;
        vkRichCell.setLeft(bVar);
        tlo0.Companion.getClass();
        vkRichCell.setMiddle(ahn.v(new vgv0(new tlo0.h(fromHtml), (ngv0.a) null, (ngv0) null, 0, 30), null, new qgv0(new tlo0.h(string2), (ngv0.a) null, (ngv0.a) null, 0, 30), null, null, null, null, IronSourceError.ERROR_CODE_INVALID_KEY_VALUE));
    }
}
