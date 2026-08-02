package xsna;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.core.view.components.cell.VkCellSkeleton;
import com.vk.core.view.components.skeleton.VkTextSkeleton;
import com.vk.dto.attaches.AttachMap;
import com.vk.feed.core.models.actions.ActionOpenModal;
import com.vk.feed.core.models.actions.HeaderAction;
import com.vk.photo.editor.PhotoEditorView;
import com.vk.profile.design.compose.header.sink.AuthorHeaderEvent;
import com.vkontakte.android.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import xsna.a3p0;
import xsna.a9j0;
import xsna.cz40;
import xsna.mr70;
import xsna.o4q0;
import xsna.plz;
import xsna.tha0;
import xsna.z6x0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class fqd implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fqd(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        String str;
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                iqd iqdVar = (iqd) obj;
                ((tw50) obj2).b(iqdVar.b, new gy0(iqdVar, 21));
                return s3q0.a;
            case 1:
                ((afe) obj2).a.V1(((a3p0.a.C2519a) obj).e);
                return s3q0.a;
            case 2:
                n2k0 n2k0Var = (n2k0) obj;
                izs<? super n2k0, s3q0> izsVar = ((l1g) obj2).b;
                if (izsVar != null) {
                    izsVar.invoke(n2k0Var);
                }
                return s3q0.a;
            case 3:
                return new SimpleDateFormat(((Context) obj2).getString(R.string.vkim_dialogs_list_time_this_year), ((vlm) obj).f);
            case 4:
                ((izs) obj2).invoke(new AuthorHeaderEvent.Info.e((String) obj));
                return s3q0.a;
            case 5:
                plz.a.C3518a c3518a = (plz.a.C3518a) obj;
                ww50 v = s200.v(((plz) obj2).requireContext());
                if (v != null) {
                    v.H(c3518a);
                }
                return s3q0.a;
            case 6:
                zyz zyzVar = (zyz) obj2;
                tha0.a aVar = zyzVar.e;
                aVar.getClass();
                aVar.a(Collections.singletonList((AttachMap) obj), zyzVar.a, zyzVar.b);
                return s3q0.a;
            case 7:
                LayoutInflater layoutInflater = (LayoutInflater) obj2;
                return layoutInflater == null ? LayoutInflater.from((Activity) obj) : layoutInflater;
            case 8:
                mtk0 mtk0Var = (mtk0) obj;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : (List) obj2) {
                    kb70 kb70Var = (kb70) obj3;
                    List list = (List) mtk0Var.getValue();
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (epx.f(((xuy) it.next()).getKey(), kb70Var.getKey())) {
                                arrayList.add(obj3);
                            }
                        }
                    }
                }
                return arrayList;
            case 9:
                izs izsVar2 = (izs) obj;
                o4q0.b bVar = ((o4q0) obj2).e;
                if (bVar != null && (str = bVar.b) != null) {
                    izsVar2.invoke(new mr70.f(str, ""));
                }
                return s3q0.a;
            case 10:
                return PhotoEditorView.b((PhotoEditorView) obj2, (f5p) obj);
            case 11:
                return ((uva0) obj2).a.c() instanceof cz40.b.C2691b ? new o370() : new wv40((com.vk.music.pref.a) obj);
            case 12:
                ((e8j0) obj2).l1.invoke(((a9j0.g) ((a9j0) obj)).a);
                return s3q0.a;
            case 13:
                ((epi) obj2).b(new dpi((UIBlockPlaceholder) obj));
                return s3q0.a;
            case 14:
                izs izsVar3 = (izs) obj;
                HeaderAction headerAction = ((ActionOpenModal.ModalButton) obj2).c;
                if (headerAction != null && izsVar3 != null) {
                    izsVar3.invoke(headerAction);
                }
                return s3q0.a;
            case 15:
                tho0 tho0Var = (tho0) obj2;
                wh50 wh50Var = (wh50) obj;
                if (!qko0.b(tho0Var.b, ((tho0) wh50Var.getValue()).b) || !epx.f(tho0Var.c, ((tho0) wh50Var.getValue()).c)) {
                    wh50Var.setValue(tho0Var);
                }
                return s3q0.a;
            case 16:
                ((com.vk.libvideo.autoplay.background.controller.f) obj2).G((yg5) obj);
                return s3q0.a;
            case 17:
                Context context = (Context) obj2;
                VkCellSkeleton vkCellSkeleton = (VkCellSkeleton) obj;
                int i2 = VkCellSkeleton.n;
                VkTextSkeleton vkTextSkeleton = new VkTextSkeleton(context, null, 6, 0);
                vkTextSkeleton.setId(R.id.ds_internal_cell_skeleton_middle_subtitle);
                vkTextSkeleton.setArea(vkCellSkeleton.getArea());
                vkTextSkeleton.setShimmer(vkCellSkeleton.b);
                vkTextSkeleton.setShimmerManagedExternally(true);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.setMarginStart(e3m.a(R.dimen.vk_ui_spacing_size_l, context));
                layoutParams.setMarginEnd(e3m.a(R.dimen.vk_ui_spacing_size_l, context));
                layoutParams.topMargin = e3m.a(R.dimen.vk_ui_spacing_size2_xs, context);
                vkTextSkeleton.setLayoutParams(layoutParams);
                vkTextSkeleton.setIncludeFontPadding(false);
                vkTextSkeleton.setTextAppearance(e3m.g(R.attr.vk_ui_typography_footnote, context));
                return vkTextSkeleton;
            case 18:
                ((kzv0) obj2).f.D((Context) obj, true);
                return Boolean.TRUE;
            default:
                ((y6x0) obj2).a.getContentResolver().unregisterContentObserver((z6x0.a) obj);
                return s3q0.a;
        }
    }
}
