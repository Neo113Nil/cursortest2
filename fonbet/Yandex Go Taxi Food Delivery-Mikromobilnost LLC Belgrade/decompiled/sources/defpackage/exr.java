package defpackage;

import com.yandex.messaging.core.net.entities.FoldersBucket;
import com.ybsdk.feature.divkit.api.data.LocalSkeleton;
import com.ybsdk.feature.divkit.api.data.RawSkeletonId;
import java.util.Set;
import kotlin.collections.a;

/* loaded from: classes3.dex */
public final /* synthetic */ class exr implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Set b;

    public /* synthetic */ exr(int i, Set set) {
        this.a = i;
        this.b = set;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        boolean contains;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Set set = this.b;
        switch (i) {
            case 0:
                FoldersBucket.MainFolderConfig mainFolderConfig = ((FoldersBucket.OrganizationFoldersData) obj).mainFolder;
                if (mainFolderConfig != null) {
                    mainFolderConfig.excludedFolderIds = a.J0(set);
                }
                return zy11Var;
            case 1:
                ((w3j0) obj).e("regions", set);
                return zy11Var;
            case 2:
                contains = set.contains(RawSkeletonId.m431boximpl(((LocalSkeleton) obj).m430getSkeletonId6QunHn0()));
                break;
            case 3:
                contains = set.contains((pwz0) obj);
                break;
            case 4:
                contains = set.contains(((mi31) obj).f);
                break;
            default:
                contains = set.contains(((mi31) obj).f);
                break;
        }
        return Boolean.valueOf(contains);
    }
}
