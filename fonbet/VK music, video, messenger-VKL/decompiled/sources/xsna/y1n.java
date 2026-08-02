package xsna;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.widget.Toast;
import com.vk.dto.common.Attachment;
import com.vk.dto.newsfeed.entries.discover.PhotoDiscoverGridItem;
import com.vk.dto.newsfeed.entries.discover.VideoDiscoverGridItem;
import com.vk.ecomm.storefrontservices.impl.presentation.feature.ServicesSort;
import com.vk.feed.core.models.discover.DiscoverGridItem;
import com.vk.feed.core.models.discover.DiscoverMediaBlock;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.R;
import com.vkontakte.android.data.PostInteract;
import java.util.ArrayList;
import xsna.wih0;
import xsna.wml0;
import xsna.yt0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class y1n implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ y1n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, java.util.Map] */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                DiscoverMediaBlock discoverMediaBlock = (DiscoverMediaBlock) this.c;
                DiscoverGridItem discoverGridItem = (DiscoverGridItem) this.d;
                i170 i170Var = (i170) this.e;
                ArrayList arrayList = (ArrayList) this.f;
                ArrayList arrayList2 = (ArrayList) this.g;
                NewsEntry newsEntry = discoverGridItem.c;
                ol60 ol60Var = null;
                Attachment attachment = discoverGridItem instanceof VideoDiscoverGridItem ? ((VideoDiscoverGridItem) discoverGridItem).j : discoverGridItem instanceof PhotoDiscoverGridItem ? ((PhotoDiscoverGridItem) discoverGridItem).j : null;
                String str = i170Var.d;
                String str2 = i170Var.c;
                PostInteract Ab = PostInteract.Ab(str, newsEntry);
                if (attachment != null) {
                    a2c0.m(attachment, newsEntry, newsEntry, Ab, str2);
                }
                int a = g2n.a(newsEntry, discoverGridItem);
                k2n k2nVar = new k2n(newsEntry, discoverMediaBlock, a, discoverGridItem.d, discoverGridItem.e, discoverGridItem);
                d3n d3nVar = new d3n(discoverMediaBlock, discoverGridItem, i170Var);
                if (a == 1206) {
                    ol60Var = (ol60) j5g.Y(new l4n().a(d3nVar));
                } else if (a == 1207) {
                    ol60Var = (ol60) j5g.Y(new c6n().a(d3nVar));
                }
                k2nVar.h = ol60Var;
                k2nVar.l = str2;
                if (ol60Var != null) {
                    arrayList.add(ol60Var);
                }
                arrayList2.add(k2nVar);
                break;
            case 1:
                izs izsVar = (izs) this.c;
                wh50 wh50Var = (wh50) this.d;
                wh50 wh50Var2 = (wh50) this.e;
                wh50 wh50Var3 = (wh50) this.f;
                wh50 wh50Var4 = (wh50) this.g;
                ServicesSort servicesSort = (ServicesSort) wh50Var3.getValue();
                Integer num = (Integer) wh50Var.getValue();
                Integer num2 = (Integer) wh50Var2.getValue();
                String str3 = (String) wh50Var4.getValue();
                if (epx.f(str3, "category_all_id")) {
                    str3 = null;
                }
                izsVar.invoke(new wml0.b.c(servicesSort, num, num2, str3));
                break;
            default:
                Context context = (Context) this.c;
                String str4 = (String) this.d;
                zo00 zo00Var = (zo00) this.e;
                String str5 = (String) this.f;
                wih0.b.a aVar = (wih0.b.a) this.g;
                ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(str4, str4));
                Toast.makeText(context, context.getString(R.string.ad_marker_copied), 0).show();
                zo00Var.d.invoke(new yt0.h.c(new zt0(str5, aVar.k)));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ y1n(z1n z1nVar, DiscoverMediaBlock discoverMediaBlock, DiscoverGridItem discoverGridItem, i170 i170Var, ArrayList arrayList, ArrayList arrayList2) {
        this.b = 0;
        this.c = discoverMediaBlock;
        this.d = discoverGridItem;
        this.e = i170Var;
        this.f = arrayList;
        this.g = arrayList2;
    }
}
