package xsna;

import android.graphics.Bitmap;
import android.os.Parcelable;
import com.vk.api.base.Document;
import com.vk.documents.impl.TypedDocumentsListFragment;
import com.vk.documents.ui.fragments.DocumentsViewFragment;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vkontakte.android.api.DocsGetTypesResult;
import com.vkontakte.android.attachments.DocumentAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class sf implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sf(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x011a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c2 A[SYNTHETIC] */
    @Override // io.reactivex.rxjava3.functions.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void accept(Object obj) {
        int i;
        wun wunVar;
        List<Document> y0;
        int i2 = this.b;
        Object obj2 = this.c;
        switch (i2) {
            case 0:
                ((rf) obj2).invoke(obj);
                return;
            case 1:
                ((t50) obj2).invoke(obj);
                return;
            case 2:
                ((hi3) obj2).invoke(obj);
                return;
            case 3:
                ((bi6) obj2).invoke(obj);
                return;
            case 4:
                com.vk.clips.design.view.timeline.a aVar = (com.vk.clips.design.view.timeline.a) obj2;
                aVar.p.add((Bitmap) obj);
                aVar.invalidate();
                return;
            case 5:
                ((ot) obj2).invoke(obj);
                return;
            case 6:
                ((rf) obj2).invoke(obj);
                return;
            case 7:
                ((com.vk.movika.sdk.base.logic.interactor.p) obj2).invoke(obj);
                return;
            case 8:
                ((com.vk.movika.sdk.base.logic.interactor.p) obj2).invoke(obj);
                return;
            case 9:
                ((com.vk.movika.sdk.base.logic.interactor.p) obj2).invoke(obj);
                return;
            case 10:
                ((wh9) obj2).invoke(obj);
                return;
            case 11:
                ((l9a) obj2).invoke(obj);
                return;
            case 12:
                ((com.vk.movika.sdk.base.logic.interactor.p) obj2).invoke(obj);
                return;
            case 13:
                ((com.vk.movika.sdk.base.logic.interactor.p) obj2).invoke(obj);
                return;
            case 14:
                ChatFragment.d dVar = ChatFragment.w1;
                ((crb) obj2).invoke(obj);
                return;
            case 15:
                ((hi3) obj2).invoke(obj);
                return;
            case 16:
                ((ut6) obj2).invoke(obj);
                return;
            case 17:
                ((fdg) obj2).invoke(obj);
                return;
            case 18:
                ((com.vk.movika.sdk.base.logic.interactor.p) obj2).invoke(obj);
                return;
            case 19:
                ((e89) obj2).invoke(obj);
                return;
            case 20:
                ((ut6) obj2).invoke(obj);
                return;
            case 21:
                ((qpj) obj2).invoke(obj);
                return;
            case 22:
                ((ut6) obj2).invoke(obj);
                return;
            case 23:
                DocumentsViewFragment documentsViewFragment = (DocumentsViewFragment) obj2;
                io.reactivex.rxjava3.disposables.b bVar = documentsViewFragment.n0;
                if (obj instanceof paq0) {
                    paq0 paq0Var = (paq0) obj;
                    List<TypedDocumentsListFragment> list = documentsViewFragment.m0;
                    if (list == null) {
                        return;
                    }
                    Parcelable parcelable = paq0Var.b;
                    if (parcelable instanceof DocumentAttachment) {
                        Document Jb = ((DocumentAttachment) parcelable).Jb();
                        io.reactivex.rxjava3.core.q i3 = wmi0.a.i("userDocs", true);
                        hvn hvnVar = new hvn(Jb);
                        int i4 = kwg0.a;
                        bVar.b(i3.subscribe(hvnVar, new iwg0()));
                        list.get(documentsViewFragment.l0.a.getCurrentItem()).ko();
                        list.get(0).ko();
                        return;
                    }
                    return;
                }
                if (obj instanceof abq0) {
                    cvk.w(((abq0) obj).c, false);
                    return;
                }
                if (obj instanceof pun) {
                    pun punVar = (pun) obj;
                    int i5 = punVar.a;
                    io.reactivex.rxjava3.core.q i6 = wmi0.a.i("userDocs", true);
                    ivn ivnVar = new ivn(i5);
                    int i7 = kwg0.a;
                    bVar.b(i6.subscribe(ivnVar, new iwg0()));
                    List<TypedDocumentsListFragment> list2 = documentsViewFragment.m0;
                    if (!(punVar instanceof bun) || list2 == null) {
                        return;
                    }
                    int i8 = ((bun) punVar).b;
                    for (TypedDocumentsListFragment typedDocumentsListFragment : list2) {
                        if (!typedDocumentsListFragment.a0) {
                            typedDocumentsListFragment.ko();
                        } else if (typedDocumentsListFragment.jo() == DocsGetTypesResult.DocType.Type.ALL.h() || typedDocumentsListFragment.jo() == i8) {
                            wun wunVar2 = typedDocumentsListFragment.S;
                            if (wunVar2 != null && (y0 = wunVar2.y0()) != null) {
                                Iterator it = ((ArrayList) y0).iterator();
                                i = 0;
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    int i9 = i + 1;
                                    if (i < 0) {
                                        e43.t();
                                        throw null;
                                    }
                                    Document document = (Document) next;
                                    if (document == null || i5 != document.b) {
                                        i = i9;
                                    } else if (i >= 0) {
                                        wun wunVar3 = typedDocumentsListFragment.S;
                                        if (i < (wunVar3 != null ? wunVar3.getItemCount() : 0) && (wunVar = typedDocumentsListFragment.S) != null) {
                                            wunVar.D0(i);
                                        }
                                    }
                                }
                            }
                            i = -1;
                            if (i >= 0) {
                            }
                        }
                    }
                    return;
                }
                return;
            case 24:
                ((qpj) obj2).invoke(obj);
                return;
            case 25:
                ((qi3) obj2).invoke(obj);
                return;
            case 26:
                ((wh9) obj2).invoke(obj);
                return;
            case 27:
                ((qpj) obj2).invoke(obj);
                return;
            case 28:
                ((x8m) obj2).invoke(obj);
                return;
            default:
                ((dn20) obj2).invoke(obj);
                return;
        }
    }
}
