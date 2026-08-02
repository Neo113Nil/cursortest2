package xsna;

import android.widget.EditText;
import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockGroupFilter;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.dto.ui.UIBlockShimmer;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionGoToAuthor;
import com.vk.catalog2.common.ui.holders.search.SearchResultsVh;
import com.vk.catalog2.feature.music.ui.holder.PodcastCatalogRootVh;
import com.vk.community.design.view.donut.DonutUserStackView;
import com.vk.core.compose.component.defaults.SeparatorAppearance;
import com.vk.core.compose.component.defaults.SeparatorDpi;
import com.vk.dto.photo.Photo;
import com.vk.search.ui.api.SearchInputMethod;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class ah7 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ah7(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x034b, code lost:
    
        if (r9 != (-1)) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x034d, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0353, code lost:
    
        if (r4 == null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0355, code lost:
    
        r4 = r4.intValue();
        r5 = (com.vk.catalog2.common.dto.api.ui.UIBlock) r6.get(r4);
        r9 = new java.util.ArrayList(5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0364, code lost:
    
        if (r3 >= 5) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0366, code lost:
    
        r9.add(new com.vk.catalog2.common.dto.ui.UIBlockShimmer(com.vk.catalog2.common.dto.api.ui.a.a(xsna.sua.l(r5), r5.b + '_' + r3, null, com.vk.catalog2.common.dto.api.CatalogViewType.SYNTHETIC_PLACEHOLDER, com.vk.catalog2.common.dto.api.CatalogDataType.DATA_SYNTHETIC_LOADING, null, null, 8178), r7 == true ? 1 : 0, r8, r7 == true ? 1 : 0));
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x039a, code lost:
    
        r6.set(r4, new com.vk.catalog2.common.dto.ui.UIBlockList(r5.b, com.vk.catalog2.common.dto.api.CatalogViewType.LARGE_LIST, com.vk.catalog2.common.dto.api.CatalogDataType.DATA_SYNTHETIC_SECTION, r5.f, r5.g, r5.h, r5.Db(), r5.j, null, null, r9, null, null, null, null, null, null, null, null, null, false, null, false, null, null, false, null, null, null, null, 1071644672, null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x03e6, code lost:
    
        r5 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x034f, code lost:
    
        r4 = java.lang.Integer.valueOf(r9);
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        int i;
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ((bh7) this.c).c(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 1:
                ((Integer) obj2).getClass();
                ((f1i) this.c).fo(ne7.I(9), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 2:
                ((Integer) obj2).getClass();
                ((DonutUserStackView) this.c).A(ne7.I(9), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 3:
                ((Integer) obj2).getClass();
                cfp.c((q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 4:
                UIBlockList uIBlockList = (UIBlockList) obj;
                int i2 = 0;
                boolean z = !((UIBlockGroupFilter) this.c).z.e && fxc0.B().J().L();
                ArrayList<UIBlock> arrayList = uIBlockList.y;
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it = arrayList.iterator();
                while (true) {
                    UIBlock uIBlock = null;
                    Object[] objArr = 0;
                    Object[] objArr2 = 0;
                    Object[] objArr3 = 0;
                    Object[] objArr4 = 0;
                    Object[] objArr5 = 0;
                    Object[] objArr6 = 0;
                    int i3 = 2;
                    if (!it.hasNext()) {
                        if (arrayList2.isEmpty()) {
                            i = 0;
                        } else {
                            Iterator it2 = arrayList2.iterator();
                            i = 0;
                            while (it2.hasNext()) {
                                if ((((UIBlock) it2.next()) instanceof UIBlockShimmer) && (i = i + 1) < 0) {
                                    e43.s();
                                    throw null;
                                }
                            }
                        }
                        if (z) {
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            Iterator it3 = arrayList3.iterator();
                            int i4 = 0;
                            while (true) {
                                if (it3.hasNext()) {
                                    Object next = it3.next();
                                    if (i4 < 0) {
                                        e43.t();
                                        throw null;
                                    }
                                    if (!(((UIBlock) next) instanceof UIBlockShimmer)) {
                                        i4++;
                                    }
                                } else {
                                    i4 = -1;
                                }
                            }
                            Integer valueOf = i4 == -1 ? null : Integer.valueOf(i4);
                            if (valueOf != null) {
                                int intValue = valueOf.intValue();
                                UIBlock uIBlock2 = (UIBlock) arrayList3.get(intValue);
                                arrayList3.set(intValue, new UIBlockList(uIBlock2.b, CatalogViewType.LARGE_LIST, CatalogDataType.DATA_SYNTHETIC_SECTION, uIBlock2.f, uIBlock2.g, uIBlock2.h, uIBlock2.Db(), uIBlock2.j, null, null, j5g.u0(j5g.S(arrayList3, intValue), Collections.singletonList(new UIBlockShimmer(com.vk.catalog2.common.dto.api.ui.a.a(sua.l(uIBlock2), i5s.a(new StringBuilder(), uIBlock2.b, "_goto"), null, CatalogViewType.VIDEO_GO_TO_AUTHOR, CatalogDataType.DATA_SYNTHETIC_LOADING, null, null, 8178), objArr4 == true ? 1 : 0, i3, objArr3 == true ? 1 : 0))), null, null, null, null, null, null, null, null, null, false, null, false, null, null, false, null, null, null, null, 1071644672, null));
                            }
                            arrayList2 = arrayList3;
                        }
                        if (i < 5) {
                            ArrayList arrayList4 = new ArrayList(arrayList2);
                            Iterator it4 = arrayList4.iterator();
                            int i5 = 0;
                            while (true) {
                                if (!it4.hasNext()) {
                                    i5 = -1;
                                    break;
                                } else {
                                    Object next2 = it4.next();
                                    if (i5 < 0) {
                                        e43.t();
                                        throw null;
                                    }
                                    if (((UIBlock) next2) instanceof UIBlockShimmer) {
                                        break;
                                    } else {
                                        i5++;
                                    }
                                }
                            }
                        }
                        return new UIBlockList(uIBlockList, arrayList2);
                    }
                    UIBlock uIBlock3 = (UIBlock) it.next();
                    if ((uIBlock3 instanceof UIBlockVideo) || (uIBlock3 instanceof UIBlockPlaceholder)) {
                        uIBlock = new UIBlockShimmer(com.vk.catalog2.common.dto.api.ui.a.a(sua.l(uIBlock3), null, null, CatalogViewType.SYNTHETIC_PLACEHOLDER, CatalogDataType.DATA_SYNTHETIC_LOADING, null, null, 8179), objArr6 == true ? 1 : 0, i3, objArr5 == true ? 1 : 0);
                    } else if (!(uIBlock3 instanceof UIBlockActionGoToAuthor)) {
                        uIBlock = uIBlock3;
                    }
                    if (uIBlock != null) {
                        arrayList2.add(uIBlock);
                    }
                }
                break;
            case 5:
                ((Integer) obj2).getClass();
                ((com.vk.core.compose.component.cell.content.g0) this.c).a(tpg0.a, q630.a.a, (androidx.compose.runtime.a) obj, ne7.I(55));
                return s3q0.a;
            case 6:
                Photo photo = (Photo) this.c;
                EditText editText = (EditText) obj;
                editText.setLines(4);
                editText.setGravity(8388659);
                editText.setText(photo.u);
                editText.setSelection(editText.getText().length());
                editText.setTextColor(e3m.f(R.attr.vk_ui_text_primary, editText.getContext()));
                editText.setHintTextColor(e3m.f(R.attr.vk_ui_text_secondary, editText.getContext()));
                return s3q0.a;
            case 7:
                PodcastCatalogRootVh podcastCatalogRootVh = (PodcastCatalogRootVh) this.c;
                String str = (String) obj;
                SearchInputMethod searchInputMethod = (SearchInputMethod) obj2;
                if (podcastCatalogRootVh.w.r instanceof vyh0) {
                    podcastCatalogRootVh.p = str;
                    podcastCatalogRootVh.q = null;
                    SearchResultsVh.cb(podcastCatalogRootVh.u, str, null, null, false, searchInputMethod, false, 46);
                }
                return s3q0.a;
            case 8:
                ((afi0) this.c).g(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
                return s3q0.a;
            case 9:
                us2 us2Var = (us2) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1318082402, intValue2, -1, "com.vk.profile.design.compose.profileserviceinfo.UserProfileServiceInfo.<anonymous> (UserProfileServiceInfo.kt:33)");
                    }
                    if (us2Var == null) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        return s3q0.a;
                    }
                    a.m mVar = androidx.compose.foundation.layout.a.c;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar, 0);
                    int hashCode = Long.hashCode(n34.n(aVar));
                    sy90 D = aVar.D();
                    q630.a aVar2 = q630.a.a;
                    q630 c = qri.c(aVar, aVar2);
                    cri.h7.getClass();
                    LayoutNode.a aVar3 = cri.a.b;
                    if (aVar.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar.H();
                    if (aVar.L()) {
                        aVar.I(aVar3);
                    } else {
                        aVar.f();
                    }
                    k9q0.w(aVar, a, cri.a.f);
                    k9q0.w(aVar, D, cri.a.e);
                    k9q0.w(aVar, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar, cri.a.h);
                    k9q0.w(aVar, c, cri.a.d);
                    ijv0.c(SeparatorDpi.At2x, SeparatorAppearance.Primary, s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar2, 1.0f)), aVar, 438, 0);
                    f9t.e(txj0.h(aVar2, (float) 31.5d), aVar, 6);
                    float f = 32;
                    yqv0.d(us2Var, s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar2, 1.0f)), 0L, 3, null, 0, false, 0, null, null, null, aVar, 48, 0, 16316);
                    if (xga0.c(aVar2, f, aVar, 6)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            default:
                ((Integer) obj2).getClass();
                ((ihs0) this.c).co(ne7.I(9), (androidx.compose.runtime.a) obj);
                return s3q0.a;
        }
    }

    public /* synthetic */ ah7(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
