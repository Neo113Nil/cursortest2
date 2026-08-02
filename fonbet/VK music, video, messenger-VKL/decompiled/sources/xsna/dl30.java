package xsna;

import android.content.Context;
import android.os.Bundle;
import android.util.Size;
import com.vk.api.base.Document;
import com.vk.api.base.VkPaginationList;
import com.vk.documents.impl.TypedDocumentsListFragment;
import com.vk.documents.ui.fragments.DocumentsViewFragment;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import com.vkontakte.android.R;
import com.vkontakte.android.api.DocsGetTypesResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.ikv0;
import xsna.tlo0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class dl30 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ dl30(Object obj, Object obj2, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.e = obj2;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        List<Document> list;
        switch (this.b) {
            case 0:
                com.vk.im.ui.components.msg_list.a aVar = (com.vk.im.ui.components.msg_list.a) this.d;
                Throwable th = (Throwable) obj;
                aVar.X.d((Peer) this.e, false);
                Context context = aVar.k;
                tlo0.h d = oq.d(tlo0.Companion, context.getString(this.c ? R.string.vkim_unsubscribe_error : R.string.vkim_subscribe_error));
                ikv0.a aVar2 = new ikv0.a(context);
                float f = 28;
                aVar2.t = new ikv0.c.C3058c(R.drawable.vk_icon_error_triangle_outline_56, Integer.valueOf(R.attr.vk_ui_icon_negative), new Size(iah0.a(f), iah0.a(f)), 8);
                aVar2.u = new ikv0.d(new ikv0.d.c(tlo0.b.a(d, context).toString()), (ikv0.d.b) null, (ikv0.d.a) null, 6);
                aVar2.n();
                L.i(th);
                break;
            default:
                TypedDocumentsListFragment typedDocumentsListFragment = (TypedDocumentsListFragment) this.d;
                com.vk.lists.c cVar = (com.vk.lists.c) this.e;
                VkPaginationList vkPaginationList = (VkPaginationList) obj;
                typedDocumentsListFragment.a0 = true;
                typedDocumentsListFragment.X = false;
                eun eunVar = typedDocumentsListFragment.c0;
                if (eunVar != null) {
                    List<T> list2 = vkPaginationList.b;
                    DocumentsViewFragment documentsViewFragment = (DocumentsViewFragment) eunVar;
                    ArrayList arrayList = new ArrayList();
                    for (T t : list2) {
                        Iterator<TypedDocumentsListFragment> it = documentsViewFragment.m0.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (it.next().jo() == t.i) {
                                    break;
                                }
                            } else {
                                arrayList.add(t);
                            }
                        }
                    }
                    if (arrayList.size() != 0) {
                        UserId userId = documentsViewFragment.p0;
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            int i = ((Document) it2.next()).i;
                            TypedDocumentsListFragment.a aVar3 = new TypedDocumentsListFragment.a();
                            Bundle bundle = aVar3.j;
                            bundle.putParcelable("owner_id", userId);
                            bundle.putInt("type_id", i);
                            arrayList2.add((TypedDocumentsListFragment) aVar3.f());
                            Context context2 = e43.a;
                            if (context2 == null) {
                                context2 = null;
                            }
                            DocsGetTypesResult.DocType.Type.Companion.getClass();
                            arrayList3.add(context2.getString(DocsGetTypesResult.DocType.Type.a.a(i).i()));
                        }
                        Pair pair = new Pair(arrayList2, arrayList3);
                        int size = documentsViewFragment.m0.size() - 1;
                        Iterator it3 = ((List) pair.i()).iterator();
                        Iterator it4 = ((List) pair.j()).iterator();
                        while (it3.hasNext() && it4.hasNext()) {
                            TypedDocumentsListFragment typedDocumentsListFragment2 = (TypedDocumentsListFragment) it3.next();
                            typedDocumentsListFragment2.c0 = documentsViewFragment.q0;
                            documentsViewFragment.m0.add(typedDocumentsListFragment2);
                            size++;
                            documentsViewFragment.l0.a(size, typedDocumentsListFragment2, (CharSequence) it4.next());
                        }
                    }
                }
                List<T> list3 = vkPaginationList.b;
                int i2 = cVar.i() + list3.size();
                int i3 = vkPaginationList.c;
                boolean z = i2 < i3;
                cVar.l(i3);
                boolean z2 = this.c;
                if (z2) {
                    wun wunVar = typedDocumentsListFragment.S;
                    if (wunVar != null) {
                        wunVar.setItems(list3);
                    }
                } else {
                    wun wunVar2 = typedDocumentsListFragment.S;
                    if (wunVar2 != null) {
                        wunVar2.n0(list3);
                    }
                }
                if (z) {
                    wun wunVar3 = typedDocumentsListFragment.S;
                    cVar.q(wunVar3 != null ? wunVar3.getItemCount() : 0);
                } else {
                    cVar.r(false);
                }
                if (!z2 || typedDocumentsListFragment.Y == null) {
                    VkPaginationList<Document> vkPaginationList2 = typedDocumentsListFragment.Y;
                    typedDocumentsListFragment.Y = new VkPaginationList<>((vkPaginationList2 == null || (list = vkPaginationList2.b) == null) ? EmptyList.b : j5g.u0(list3, list), vkPaginationList.c, vkPaginationList.d, 0, 8, null);
                }
                break;
        }
        return s3q0.a;
    }
}
