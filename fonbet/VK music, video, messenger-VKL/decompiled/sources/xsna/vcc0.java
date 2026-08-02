package xsna;

import com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.domain.PostingContentType;
import com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.feature.model.PostingAuthorUiModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.builders.ListBuilder;

/* compiled from: PostingAuthorDataUiModel.kt */
/* loaded from: classes4.dex */
public final class vcc0 {
    public final PostingAuthorUiModel a;
    public final ArrayList b;
    public final List<PostingContentType> c;
    public final boolean d;
    public final String e;
    public final String f;

    public vcc0(PostingAuthorUiModel postingAuthorUiModel, ArrayList arrayList, List list, boolean z, String str, String str2) {
        this.a = postingAuthorUiModel;
        this.b = arrayList;
        this.c = list;
        this.d = z;
        this.e = str;
        this.f = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static vcc0 a(vcc0 vcc0Var, PostingAuthorUiModel postingAuthorUiModel, ListBuilder listBuilder, boolean z, String str, String str2, int i) {
        if ((i & 1) != 0) {
            postingAuthorUiModel = vcc0Var.a;
        }
        PostingAuthorUiModel postingAuthorUiModel2 = postingAuthorUiModel;
        ArrayList arrayList = vcc0Var.b;
        List list = listBuilder;
        if ((i & 4) != 0) {
            list = vcc0Var.c;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            z = vcc0Var.d;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            str = vcc0Var.e;
        }
        String str3 = str;
        if ((i & 32) != 0) {
            str2 = vcc0Var.f;
        }
        vcc0Var.getClass();
        return new vcc0(postingAuthorUiModel2, arrayList, list2, z2, str3, str2);
    }

    public final boolean b() {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((PostingAuthorUiModel) it.next()) instanceof PostingAuthorUiModel.Community) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vcc0)) {
            return false;
        }
        vcc0 vcc0Var = (vcc0) obj;
        return epx.f(this.a, vcc0Var.a) && this.b.equals(vcc0Var.b) && epx.f(this.c, vcc0Var.c) && this.d == vcc0Var.d && epx.f(this.e, vcc0Var.e) && epx.f(this.f, vcc0Var.f);
    }

    public final int hashCode() {
        int b = qoy.b(fw3.a(qr.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
        String str = this.e;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostingAuthorDataUiModel(selectedAuthor=");
        sb.append(this.a);
        sb.append(", availableAuthors=");
        sb.append(this.b);
        sb.append(", contentTypes=");
        sb.append(this.c);
        sb.append(", showAuthorTooltip=");
        sb.append(this.d);
        sb.append(", authorTooltipTitle=");
        sb.append(this.e);
        sb.append(", authorTooltipHintId=");
        return ho8.a(sb, this.f, ')');
    }
}
