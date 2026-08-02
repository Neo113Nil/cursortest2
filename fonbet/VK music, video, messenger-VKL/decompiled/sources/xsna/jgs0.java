package xsna;

import android.content.Context;
import com.vk.search.models.VkPeopleSearchParams;
import com.vk.search.models.VkRelation;
import com.vk.superapp.api.dto.common.SearchParams;
import com.vk.superapp.api.dto.identity.WebCity;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class jgs0 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jgs0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        String sb;
        switch (this.b) {
            case 0:
                ((jvl0) this.c).invoke(obj);
                break;
            case 1:
                ((mdm0) this.c).invoke(obj);
                break;
            case 2:
                ((tev0) this.c).invoke(obj);
                break;
            case 3:
                lgv0 lgv0Var = (lgv0) this.c;
                VkPeopleSearchParams vkPeopleSearchParams = lgv0Var.r;
                nru0 nru0Var = (nru0) obj;
                vkPeopleSearchParams.Ab(nru0Var.a);
                Context requireContext = lgv0Var.requireContext();
                if (vkPeopleSearchParams.I()) {
                    sb = null;
                } else {
                    SearchParams.a aVar = new SearchParams.a();
                    WebCity webCity = vkPeopleSearchParams.c;
                    StringBuilder sb2 = aVar.a;
                    if (webCity != null) {
                        String str = webCity.c;
                        if (sb2.length() == 0) {
                            sb2.append(brm0.o(str));
                        } else {
                            sb2.append(", ");
                            sb2.append(str);
                        }
                    }
                    int i = vkPeopleSearchParams.d;
                    if (i == 2) {
                        aVar.a(requireContext.getString(R.string.vk_discover_search_gender_male));
                    } else if (i == 1) {
                        aVar.a(requireContext.getString(R.string.vk_discover_search_gender_female));
                    }
                    String string = requireContext.getString(R.string.vk_from);
                    String string2 = requireContext.getString(R.string.vk_to);
                    int i2 = vkPeopleSearchParams.e;
                    if (i2 != 0 && vkPeopleSearchParams.f != 0) {
                        StringBuilder b = v1v.b(string, ' ');
                        b.append(vkPeopleSearchParams.e);
                        b.append(' ');
                        b.append(string2);
                        b.append(' ');
                        b.append(vkPeopleSearchParams.f);
                        aVar.a(b.toString());
                    } else if (i2 != 0) {
                        StringBuilder b2 = v1v.b(string, ' ');
                        b2.append(vkPeopleSearchParams.e);
                        aVar.a(b2.toString());
                    } else if (vkPeopleSearchParams.f != 0) {
                        StringBuilder b3 = v1v.b(string2, ' ');
                        b3.append(vkPeopleSearchParams.f);
                        aVar.a(b3.toString());
                    }
                    VkRelation vkRelation = vkPeopleSearchParams.g;
                    if (vkRelation != VkPeopleSearchParams.h) {
                        aVar.a(vkRelation.a(requireContext, vkPeopleSearchParams.d == 2));
                    }
                    sb = sb2.toString();
                }
                lgv0Var.tn(sb, vkPeopleSearchParams.I());
                if (nru0Var.b) {
                    hgv0 hgv0Var = lgv0Var.n;
                    (hgv0Var != null ? hgv0Var : null).clear();
                    com.vk.lists.c cVar = lgv0Var.o;
                    if (cVar != null) {
                        cVar.p(false);
                        break;
                    }
                }
                break;
            case 4:
                ((edd) this.c).invoke(obj);
                break;
            case 5:
                ((mdm0) this.c).invoke(obj);
                break;
            default:
                ((jvl0) this.c).invoke(obj);
                break;
        }
    }
}
