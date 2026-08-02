package com.yandex.payment.sdk.ui.payment.sbp;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.evu0;
import defpackage.kbs;
import defpackage.mp4;
import defpackage.np4;
import defpackage.op4;
import defpackage.pp4;
import defpackage.qp4;
import defpackage.qv90;
import defpackage.rlh0;
import defpackage.rp4;
import defpackage.rwo;
import defpackage.sls;
import defpackage.sv90;
import defpackage.vfc;
import defpackage.wls;
import defpackage.xlh0;
import defpackage.y22;
import defpackage.y891;
import defpackage.zbd;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u0000 <2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006\u0002=>?@AB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\u000e\u001a\u00020\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0015\u001a\u00020\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u0013¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0019\u001a\u00020\r2\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0010H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020&2\u0006\u0010!\u001a\u00020\u0010H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u0010H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010.R\u0018\u00100\u001a\u00060/R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u00102R\u001c\u00103\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00102R\u0016\u00104\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u00106R\u001e\u00107\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R(\u00109\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00106¨\u0006B"}, d2 = {"Lcom/yandex/payment/sdk/ui/payment/sbp/BankAppsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lop4;", "Landroid/widget/Filterable;", "Lrwo;", "eventReporter", "<init>", "(Lrwo;)V", "", "Lmp4;", ClidProvider.APPS_TABLE_NAME, "", "showMoreButton", "Lzy11;", "setData", "(Ljava/util/List;Z)V", "", "getSelectedIndex", "()Ljava/lang/Integer;", "Lkotlin/Function0;", "listener", "setOnMoreButtonClickListener", "(Lsls;)V", "Lkotlin/Function2;", "", "setOnBankClickListener", "(Lwls;)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lop4;", "holder", "position", "onBindViewHolder", "(Lop4;I)V", "getItemCount", "()I", "", "getItemId", "(I)J", "getItemViewType", "(I)I", "Landroid/widget/Filter;", "getFilter", "()Landroid/widget/Filter;", "Lrwo;", "Lcom/yandex/payment/sdk/ui/payment/sbp/BankAppsAdapter$BankFilter;", "bankNameFilter", "Lcom/yandex/payment/sdk/ui/payment/sbp/BankAppsAdapter$BankFilter;", "Ljava/util/List;", "filtered", "selectedIndex", CA20Status.STATUS_USER_I, "Z", "moreButtonListener", "Lsls;", "onBankClick", "Lwls;", "needReportEmptyList", "Companion", "qp4", "rp4", "np4", "BankFilter", "pp4", "paymentsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BankAppsAdapter extends RecyclerView.Adapter implements Filterable {

    @Deprecated
    public static final int BANK_APP_VIEW = 11;
    private static final pp4 Companion = new pp4();

    @Deprecated
    public static final int EMPTY_MESSAGE_VIEW = 13;

    @Deprecated
    public static final int MORE_BUTTON_VIEW = 12;
    private volatile List<? extends mp4> apps;
    private final BankFilter bankNameFilter = new BankFilter();
    private final rwo eventReporter;
    private List<? extends mp4> filtered;
    private sls moreButtonListener;
    private boolean needReportEmptyList;
    private wls onBankClick;
    private int selectedIndex;
    private boolean showMoreButton;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\r\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\tH\u0015¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/yandex/payment/sdk/ui/payment/sbp/BankAppsAdapter$BankFilter;", "Landroid/widget/Filter;", "<init>", "(Lcom/yandex/payment/sdk/ui/payment/sbp/BankAppsAdapter;)V", "Lzy11;", "cancel", "()V", "", "constraint", "Landroid/widget/Filter$FilterResults;", "performFiltering", "(Ljava/lang/CharSequence;)Landroid/widget/Filter$FilterResults;", "results", "publishResults", "(Ljava/lang/CharSequence;Landroid/widget/Filter$FilterResults;)V", "", "isCancelled", "Z", "paymentsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class BankFilter extends Filter {
        private boolean isCancelled;

        public BankFilter() {
        }

        public final void cancel() {
            filter(null);
            this.isCancelled = true;
        }

        @Override // android.widget.Filter
        public Filter.FilterResults performFiltering(CharSequence constraint) {
            List list = BankAppsAdapter.this.apps;
            if (constraint == null || constraint.length() == 0) {
                Filter.FilterResults filterResults = new Filter.FilterResults();
                filterResults.values = list;
                return filterResults;
            }
            Filter.FilterResults filterResults2 = new Filter.FilterResults();
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (evu0.y(((mp4) obj).a, constraint, true)) {
                    arrayList.add(obj);
                }
            }
            filterResults2.values = arrayList;
            return filterResults2;
        }

        @Override // android.widget.Filter
        public void publishResults(CharSequence constraint, Filter.FilterResults results) {
            if (this.isCancelled) {
                this.isCancelled = false;
                return;
            }
            BankAppsAdapter bankAppsAdapter = BankAppsAdapter.this;
            Object obj = results != null ? results.values : null;
            List list = EmptyList.a;
            if (obj != null) {
                Object obj2 = results.values;
                List list2 = obj2 instanceof List ? (List) obj2 : null;
                if (list2 != null) {
                    list = list2;
                }
            }
            bankAppsAdapter.filtered = list;
            if (BankAppsAdapter.this.filtered.isEmpty() && constraint != null && constraint.length() != 0 && BankAppsAdapter.this.needReportEmptyList) {
                BankAppsAdapter.this.needReportEmptyList = false;
                rwo rwoVar = BankAppsAdapter.this.eventReporter;
                sv90 sv90Var = qv90.a;
                String obj3 = constraint.toString();
                sv90Var.getClass();
                ((y22) rwoVar).a(y891.c("sbp_bank_empty_search_result", vfc.i(0, "value", obj3, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Пустой результат поиска в списке банков по запросу: ".concat(obj3))));
            }
            if (!BankAppsAdapter.this.filtered.isEmpty()) {
                BankAppsAdapter.this.needReportEmptyList = true;
            }
            BankAppsAdapter.this.selectedIndex = 0;
            BankAppsAdapter.this.notifyDataSetChanged();
        }
    }

    public BankAppsAdapter(rwo rwoVar) {
        this.eventReporter = rwoVar;
        EmptyList emptyList = EmptyList.a;
        this.apps = emptyList;
        this.filtered = emptyList;
        this.onBankClick = new zbd(27);
        this.needReportEmptyList = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onBankClick$lambda$0(String str, int i) {
        return zy11.a;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        return this.bankNameFilter;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        int size = this.filtered.size() + (this.showMoreButton ? 1 : 0);
        if (size == 0) {
            return 1;
        }
        return size;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int position) {
        switch (getItemViewType(position)) {
            case 11:
                return this.filtered.get(position).b.hashCode();
            case 12:
                return 2L;
            case 13:
                return 1L;
            default:
                kbs.g("Wrong item type");
                return 0L;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        if (this.filtered.isEmpty()) {
            return 13;
        }
        return (this.showMoreButton && position == this.filtered.size()) ? 12 : 11;
    }

    public final Integer getSelectedIndex() {
        if (this.filtered.isEmpty()) {
            return null;
        }
        Iterator<? extends mp4> it = this.apps.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (it.next().b.equals(this.filtered.get(this.selectedIndex).b)) {
                break;
            }
            i++;
        }
        return Integer.valueOf(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public op4 onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater from = LayoutInflater.from(parent.getContext());
        switch (viewType) {
            case 11:
                return new np4(this, from.inflate(xlh0.paymentsdk_item_bank_app, parent, false), this.onBankClick);
            case 12:
                return new rp4(from.inflate(xlh0.paymentsdk_item_bank_app, parent, false), this.moreButtonListener);
            case 13:
                return new qp4(from.inflate(rlh0.paymentsdk_item_no_bank, parent, false));
            default:
                kbs.g("Wrong view type");
                return null;
        }
    }

    public final void setData(List<? extends mp4> apps, boolean showMoreButton) {
        this.apps = apps;
        this.filtered = apps;
        this.selectedIndex = 0;
        this.showMoreButton = showMoreButton;
        this.bankNameFilter.cancel();
        this.needReportEmptyList = true;
        notifyDataSetChanged();
    }

    public final void setOnBankClickListener(wls listener) {
        this.onBankClick = listener;
    }

    public final void setOnMoreButtonClickListener(sls listener) {
        this.moreButtonListener = listener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(op4 holder, int position) {
        holder.W(position);
    }
}
