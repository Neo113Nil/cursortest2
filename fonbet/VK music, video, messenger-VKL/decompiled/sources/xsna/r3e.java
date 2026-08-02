package xsna;

import android.content.DialogInterface;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.widget.ProgressBar;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.vk.clips.favorites.impl.ui.folders.list.ClipsFavoriteFoldersListFragment;
import com.vk.clips.favorites.impl.ui.folders.list.e;
import com.vk.clips.sdk.shared.FavoriteFolderId;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.ecomm.categories.api.MarketBridgeCategory;
import com.vk.ecomm.market.api.search.filters.dto.MarketCatalogFilterVM;
import com.vk.lists.DefaultErrorView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.gm50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class r3e implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ r3e(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    /* JADX WARN: Type inference failed for: r15v15, types: [T, xsna.wqd0] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        MarketBridgeCategory b;
        int i = this.b;
        int i2 = 0;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) obj5;
                ClipsFavoriteFoldersListFragment clipsFavoriteFoldersListFragment = (ClipsFavoriteFoldersListFragment) obj2;
                e.a aVar = (e.a) obj;
                int i3 = ClipsFavoriteFoldersListFragment.U;
                swipeRefreshLayout.setVisibility(0);
                ((ProgressBar) obj4).setVisibility(8);
                ((DefaultErrorView) obj3).setVisibility(8);
                gm50.a.a(clipsFavoriteFoldersListFragment, aVar.a, new t9(clipsFavoriteFoldersListFragment, 27));
                gm50.a.a(clipsFavoriteFoldersListFragment, aVar.b, new v5(swipeRefreshLayout, 25));
                return s3q0.a;
            case 1:
                List list = (List) obj5;
                h5e h5eVar = (h5e) obj4;
                UserId userId = (UserId) obj3;
                FavoriteFolderId favoriteFolderId = (FavoriteFolderId) obj2;
                VideoFile videoFile = (VideoFile) j5g.a0(((j3e) obj).a);
                String a1 = videoFile != null ? videoFile.a1() : null;
                List list2 = list;
                ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((VideoFile) it.next()).a1());
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (!epx.f((String) next, a1)) {
                        arrayList2.add(next);
                    }
                }
                return !arrayList2.isEmpty() ? h5eVar.a.a(favoriteFolderId, userId, a1, arrayList2) : s5e.d(h5eVar.a, userId, Collections.singletonList(favoriteFolderId), null, null, 1, 12).l(new s41(new md(17), 13));
            case 2:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj4;
                MarketBridgeCategory marketBridgeCategory = (MarketBridgeCategory) obj3;
                Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) obj2;
                ?? r15 = (wqd0) obj;
                int i4 = r15.a;
                MarketCatalogFilterVM marketCatalogFilterVM = ((qy00) obj5).e;
                MarketCatalogFilterVM.c b2 = marketCatalogFilterVM.b(marketCatalogFilterVM.a);
                if (b2 != null && (b = b2.b()) != null && i4 == b.b && i4 != 9000) {
                    ref$ObjectRef.element = r15;
                }
                if (i4 == marketBridgeCategory.b) {
                    ref$ObjectRef2.element = r15;
                }
                return s3q0.a;
            case 3:
                Photo photo = (Photo) obj5;
                photo.u = (String) obj4;
                ((z520) obj3).i.e(113, photo);
                ((DialogInterface) obj2).dismiss();
                return s3q0.a;
            case 4:
                kvi kviVar = (kvi) obj4;
                ((yzt0) obj5).b(new wd3(18, (wh50) obj3, (wh50) obj2), kviVar);
                return new hk50(kviVar, i2);
            default:
                ArrayList<slv0> arrayList3 = (ArrayList) obj5;
                UserId userId2 = (UserId) obj4;
                qlv0 qlv0Var = (qlv0) obj3;
                Ref$IntRef ref$IntRef = (Ref$IntRef) obj2;
                SQLiteStatement compileStatement = ((SQLiteDatabase) obj).compileStatement("INSERT\nINTO vk_stat_events\n(event_type_id, user_id, schema_version, eventJson, size)\nVALUES (?, ?, ?, ?, ?)");
                try {
                    for (slv0 slv0Var : arrayList3) {
                        try {
                            try {
                                compileStatement.clearBindings();
                                compileStatement.bindString(1, slv0Var.a);
                                if (userId2 != null) {
                                    compileStatement.bindLong(2, userId2.b);
                                } else {
                                    compileStatement.bindNull(2);
                                }
                                String str = slv0Var.b;
                                if (str != null) {
                                    compileStatement.bindString(3, str);
                                } else {
                                    compileStatement.bindNull(3);
                                }
                                compileStatement.bindString(4, slv0Var.c.a(qlv0Var.c));
                                compileStatement.bindLong(5, r7.getBytes(emb.b).length);
                                compileStatement.executeInsert();
                                ref$IntRef.element++;
                                slv0Var.b();
                            } catch (Throwable th) {
                                slv0Var.b();
                                throw th;
                            }
                        } catch (Exception e) {
                            ref$IntRef.element = 0;
                            throw e;
                        }
                    }
                    s3q0 s3q0Var = s3q0.a;
                    ro.e(compileStatement, null);
                    return s3q0.a;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        ro.e(compileStatement, th2);
                        throw th3;
                    }
                }
        }
    }
}
