package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vk.core.view.components.radio.VkRadioButton;
import com.vk.core.view.components.text.VkText;
import com.vk.libvideo.api.quality.QualitySettingsType;
import com.vkontakte.android.R;
import java.util.List;
import xsna.hpe0;
import xsna.tlo0;

/* compiled from: VideoQualityNewSettingsAdapter.kt */
/* loaded from: classes2.dex */
public final class iat0 extends RecyclerView.Adapter<RecyclerView.e0> {
    public final gzs<List<hpe0>> c;
    public final a d;
    public List<? extends hpe0> e;

    /* compiled from: VideoQualityNewSettingsAdapter.kt */
    public interface a {
        void a(QualitySettingsType qualitySettingsType);

        void b();
    }

    /* compiled from: VideoQualityNewSettingsAdapter.kt */
    public static final class b extends RecyclerView.e0 {
        public final VkGroupHeader l;

        public b(VkGroupHeader vkGroupHeader) {
            super(vkGroupHeader);
            this.l = vkGroupHeader;
        }
    }

    /* compiled from: VideoQualityNewSettingsAdapter.kt */
    public static final class c extends RecyclerView.e0 {
    }

    /* compiled from: VideoQualityNewSettingsAdapter.kt */
    public final class d extends RecyclerView.e0 {
        public final VkCell l;
        public final List<hpe0> m;
        public final a n;

        /* JADX WARN: Multi-variable type inference failed */
        public d(VkCell vkCell, List<? extends hpe0> list, a aVar) {
            super(vkCell);
            this.l = vkCell;
            this.m = list;
            this.n = aVar;
            new VkRadioButton(vkCell.getContext(), null, 6);
            vkCell.getContext();
            jjc.g(this.itemView, new kyq0(this, 6));
        }
    }

    public iat0(gzs gzsVar, a aVar) {
        this.c = gzsVar;
        this.d = aVar;
        this.e = (List) gzsVar.invoke();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        hpe0 hpe0Var = this.e.get(i);
        if (hpe0Var instanceof hpe0.a) {
            return 0;
        }
        return hpe0Var instanceof hpe0.c ? 1 : 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        hpe0 hpe0Var = this.e.get(i);
        if (hpe0Var instanceof hpe0.a) {
            ((b) e0Var).l.setTitle(new VkGroupHeader.d(((hpe0.a) hpe0Var).a, null, null, null, 0, null, 510));
            return;
        }
        if (hpe0Var instanceof hpe0.c) {
            gpe0 gpe0Var = ((hpe0.c) hpe0Var).a;
            VkCell vkCell = ((d) e0Var).l;
            VkCell.Middle.a aVar = VkCell.Middle.Companion;
            VkCell.Middle.e eVar = new VkCell.Middle.e(oq.d(tlo0.Companion, gpe0Var.b), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62);
            String str = gpe0Var.c;
            vkCell.setMiddle(VkCell.Middle.a.a(aVar, eVar, str != null ? new VkCell.Middle.d(new tlo0.h(str), (gzs) null, 0, (TextUtils.TruncateAt) null, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 62) : null, null, 12));
            boolean z = gpe0Var.e;
            vkCell.getContext();
            vkCell.setRight(z ? new VkCell.Right.d((VkCell.Right.a) null, (VkCell.Right.e) null, new VkCell.Right.ExtraAction.a(6, null, true), (VkCell.Right.b) null, 27) : null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        lpj lpjVar = context instanceof lpj ? (lpj) context : null;
        Integer valueOf = lpjVar != null ? Integer.valueOf(lpjVar.getThemeResId()) : null;
        dhr0.a.getClass();
        int i2 = dhr0.u().c;
        if (valueOf == null || valueOf.intValue() != i2) {
            context = new l7s(context, dhr0.u().c);
        }
        if (i == 0) {
            VkGroupHeader vkGroupHeader = new VkGroupHeader(context, null, 6);
            vkGroupHeader.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            vkGroupHeader.setSize(VkGroupHeader.Size.Small);
            return new b(vkGroupHeader);
        }
        a aVar = this.d;
        if (i == 1) {
            VkCell vkCell = new VkCell(context, null, 6, 0);
            vkCell.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return new d(vkCell, this.e, aVar);
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.video_quality_settings_new_header, viewGroup, false);
        c cVar = new c(inflate);
        jjc.g((VkText) inflate.findViewById(R.id.quality_settings_go_to), new kvm0(aVar, 12));
        return cVar;
    }
}
