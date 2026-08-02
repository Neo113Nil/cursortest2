package xsna;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.im.engine.models.InfoBar;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.photo.editor.features.colorgrading.ColorGradingTool;
import com.vk.photo.editor.views.ToolButton;
import com.vk.search.integration.api.SearchDelegate;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.b26;
import xsna.gdn;
import xsna.suq;
import xsna.t69;
import xsna.xn50;

/* compiled from: AudiobookListContent.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class e15 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e15(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        hfz bVar;
        boolean contains;
        boolean z = false;
        switch (this.b) {
            case 0:
                ((i15) this.receiver).a.invoke(new gdn.e.c((String) obj));
                return s3q0.a;
            case 1:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                lm6 lm6Var = (lm6) this.receiver;
                if (booleanValue) {
                    lm6Var.getClass();
                } else {
                    f0i0 f0i0Var = lm6Var.e;
                    if (f0i0Var.b) {
                        SearchDelegate.SearchState searchState = f0i0Var.f;
                        f0i0Var.e = false;
                        SearchDelegate.SearchState a = f0i0Var.a();
                        f0i0Var.f = a;
                        if (searchState != a) {
                            f0i0Var.a.invoke();
                        }
                    }
                    lm6Var.g.reset();
                }
                return s3q0.a;
            case 2:
                o69 o69Var = (o69) obj;
                ((j69) this.receiver).getClass();
                boolean z2 = o69Var.a;
                Collection<suq> values = o69Var.b.values();
                ArrayList arrayList = new ArrayList(c5g.u(values, 10));
                for (suq suqVar : values) {
                    suq.c cVar = suqVar.c;
                    if (cVar instanceof suq.c.a) {
                        suq.c.a aVar = (suq.c.a) cVar;
                        bVar = new t69.a.C3724a(suqVar.a, aVar.a, aVar.b, aVar.c, suqVar.b, aVar.d, aVar.e, aVar.f);
                    } else {
                        if (!(cVar instanceof suq.c.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        bVar = new t69.a.b(((suq.c.b) cVar).a, suqVar.a, suqVar.b);
                    }
                    arrayList.add(bVar);
                }
                return new t69(z2, j5g.D0(new i69(0), arrayList));
            case 3:
                ((ColorGradingTool) this.receiver).I((ToolButton) obj, false);
                return s3q0.a;
            case 4:
                UIBlockList uIBlockList = (UIBlockList) obj;
                ((nog) this.receiver).getClass();
                ArrayList<UIBlock> Sb = uIBlockList.Sb();
                if (Sb == null || !Sb.isEmpty()) {
                    for (UIBlock uIBlock : Sb) {
                        if (uIBlock.Cb() != CatalogDataType.DATA_TYPE_GROUPS_INVITES && uIBlock.Cb() != CatalogDataType.DATA_TYPE_GROUPS) {
                        }
                        z = true;
                        return Boolean.valueOf(z);
                        break;
                    }
                }
                List l = e43.l(CatalogDataType.DATA_TYPE_GROUPS_INVITES, CatalogDataType.DATA_TYPE_GROUPS, CatalogDataType.DATA_TYPE_GROUPS_ITEMS, CatalogDataType.DATA_TYPE_CATALOG_GROUPS_INFO_ITEMS, CatalogDataType.DATA_TYPE_SEARCH_ENTITY_ITEMS, CatalogDataType.DATA_TYPE_SEARCH_AUTHORS);
                ArrayList<UIBlock> Sb2 = uIBlockList.Sb();
                if (Sb2 == null || !Sb2.isEmpty()) {
                    for (UIBlock uIBlock2 : Sb2) {
                        if (uIBlock2 instanceof UIBlockList) {
                            ArrayList<UIBlock> Sb3 = ((UIBlockList) uIBlock2).Sb();
                            if (Sb3 == null || !Sb3.isEmpty()) {
                                Iterator<T> it = Sb3.iterator();
                                while (it.hasNext()) {
                                    if (l.contains(((UIBlock) it.next()).Cb())) {
                                        contains = true;
                                    }
                                }
                            }
                            contains = false;
                        } else {
                            contains = l.contains(uIBlock2.Cb());
                        }
                        if (contains) {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 5:
                u6h u6hVar = (u6h) this.receiver;
                u6hVar.getClass();
                xn50.a.c(u6hVar, (t6h) obj);
                return s3q0.a;
            case 6:
                p9k p9kVar = (p9k) this.receiver;
                p9kVar.getClass();
                q2a0 q2a0Var = (q2a0) ((it80) obj).a;
                if (q2a0Var != null) {
                    p9kVar.e.onNext(q2a0Var);
                    p9kVar.e.onComplete();
                    p9kVar.c.a();
                } else {
                    p9kVar.e.onError(new RuntimeException("CreatePhonebookContactDelegate contact synchronization had no result"));
                    cvk.u(R.string.error, false);
                }
                return s3q0.a;
            case 7:
                xam xamVar = (xam) this.receiver;
                ktk0 ktk0Var = xamVar.t;
                ktk0Var.c = false;
                DialogExt dialogExt = ktk0Var.a;
                dialogExt.Hb(((wpp) obj).e(Long.valueOf(dialogExt.e)));
                xamVar.X0();
                xamVar.e1();
                InfoBar a2 = xamVar.t.a();
                b26.b bVar2 = xamVar.x;
                if (bVar2 != null) {
                    b26 b26Var = b26.this;
                    if (a2 == null) {
                        b26Var.g(b26.a.BAR, b26Var.l, 0L);
                    } else {
                        b26.n(b26Var, b26.a.BAR, b26Var.l);
                    }
                    s3q0 s3q0Var = s3q0.a;
                }
                return s3q0.a;
            case 8:
                Throwable th = (Throwable) obj;
                mem memVar = (mem) this.receiver;
                memVar.r.k = false;
                memVar.b1();
                if (memVar.s != null) {
                    zk70.e(th);
                }
                return s3q0.a;
            case 9:
                ((vrh0) this.receiver).e(((Boolean) obj).booleanValue());
                return s3q0.a;
            case 10:
                ((duh0) this.receiver).E2((String) obj);
                return s3q0.a;
            default:
                ((p7v0) this.receiver).a((Throwable) obj);
                return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e15(Object obj, int i) {
        super(1, obj, nog.class, "shouldUpdateOnSubscriptionChange", "shouldUpdateOnSubscriptionChange(Lcom/vk/catalog2/common/dto/ui/UIBlockList;)Z", 0);
        this.b = i;
        switch (i) {
            case 6:
                super(1, obj, p9k.class, "onSyncContactSuccess", "onSyncContactSuccess(Lcom/vk/core/util/Optional;)V", 0);
                break;
            case 7:
            case 8:
            default:
                break;
            case 9:
                super(1, obj, vrh0.class, "setParamsButtonVisible", "setParamsButtonVisible(Z)V", 0);
                break;
            case 10:
                super(1, obj, duh0.class, "onActionSearchClicked", "onActionSearchClicked(Ljava/lang/String;)V", 0);
                break;
        }
    }
}
