package xsna;

import android.content.Context;
import com.vk.core.view.components.radio.VkRadioItem;
import com.vk.dto.narratives.Narrative;
import com.vk.dzenarticle.impl.domain.ReadStatState;
import com.vk.dzenarticle.impl.ui.entity.DzenArticleState;
import com.vk.dzenarticle.impl.ui.store.DzenArticleInlineActor;
import com.vk.narratives.impl.highlights.AllHighlightsFragment;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.wzq0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class hu1 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hu1(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i;
        int i2;
        switch (this.b) {
            case 0:
                lu1 lu1Var = (lu1) this.d;
                if (((Boolean) obj).booleanValue()) {
                    ArrayList arrayList = lu1Var.k;
                    AllHighlightsFragment allHighlightsFragment = lu1Var.c;
                    if (arrayList == null) {
                        return s3q0.a;
                    }
                    ArrayList arrayList2 = lu1Var.l;
                    Iterator it = arrayList.iterator();
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        boolean hasNext = it.hasNext();
                        i = this.c;
                        i2 = -1;
                        if (!hasNext) {
                            i4 = -1;
                        } else if (((Narrative) it.next()).b != i) {
                            i4++;
                        }
                    }
                    arrayList.remove(i4);
                    if (!lu1Var.m) {
                        allHighlightsFragment.ko(arrayList);
                    } else if (arrayList2 != null) {
                        Iterator<Narrative> it2 = arrayList2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (it2.next().b == i) {
                                    i2 = i3;
                                } else {
                                    i3++;
                                }
                            }
                        }
                        arrayList2.remove(i2);
                        allHighlightsFragment.ko(arrayList2);
                    }
                }
                return s3q0.a;
            case 1:
                DzenArticleState dzenArticleState = (DzenArticleState) obj;
                ReadStatState readStatState = ((DzenArticleState) ((DzenArticleInlineActor) this.d).b.getCurrentState()).d;
                boolean z = readStatState.c;
                int i5 = this.c;
                return DzenArticleState.a(dzenArticleState, null, ReadStatState.a(readStatState, 0L, z || i5 >= 1, readStatState.d || i5 >= 25, readStatState.e || i5 >= 50, readStatState.f || i5 >= 75, readStatState.g || i5 >= 99, readStatState.h || i5 >= 100, 1), null, null, null, false, 123);
            case 2:
                wzs wzsVar = (wzs) this.d;
                Short sh = (Short) obj;
                sh.shortValue();
                wzsVar.invoke(Integer.valueOf(this.c), sh);
                return s3q0.a;
            case 3:
                rg50 rg50Var = (rg50) this.d;
                VkRadioItem vkRadioItem = new VkRadioItem((Context) obj, null, 6);
                vkRadioItem.setListener(new nue0(this.c, rg50Var));
                return vkRadioItem;
            default:
                rzq0 rzq0Var = (rzq0) obj;
                rzq0Var.b(new wow(((wzq0) this.d).b), wzq0.b.b);
                rzq0Var.a(new wzq0.c(this.c));
                return s3q0.a;
        }
    }
}
