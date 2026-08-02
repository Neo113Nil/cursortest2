package defpackage;

import com.yandex.messaging.core.net.entities.FoldersBucket;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.EmptyList;

/* loaded from: classes15.dex */
public final /* synthetic */ class fxr implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ jjf b;

    public /* synthetic */ fxr(jjf jjfVar, int i) {
        this.a = i;
        this.b = jjfVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Collection collection = EmptyList.a;
        jjf jjfVar = this.b;
        FoldersBucket.OrganizationFoldersData organizationFoldersData = (FoldersBucket.OrganizationFoldersData) obj;
        switch (i) {
            case 0:
                FoldersBucket.FolderData a = wwr.a(jjfVar);
                Collection collection2 = organizationFoldersData.customFolders;
                if (collection2 != null) {
                    collection = collection2;
                }
                Collection<FoldersBucket.FolderData> collection3 = collection;
                ArrayList arrayList = new ArrayList(tcc.n(collection3, 10));
                for (FoldersBucket.FolderData folderData : collection3) {
                    if (jl40.l(folderData.id, jjfVar.a)) {
                        folderData = a;
                    }
                    arrayList.add(folderData);
                }
                organizationFoldersData.customFolders = arrayList;
                break;
            default:
                FoldersBucket.FolderData a2 = wwr.a(jjfVar);
                Collection collection4 = organizationFoldersData.customFolders;
                if (collection4 != null) {
                    collection = collection4;
                }
                ArrayList arrayList2 = new ArrayList(collection);
                arrayList2.add(y6i0.d(jjfVar.d, 0, arrayList2.size()), a2);
                organizationFoldersData.customFolders = arrayList2;
                break;
        }
        return zy11Var;
    }
}
