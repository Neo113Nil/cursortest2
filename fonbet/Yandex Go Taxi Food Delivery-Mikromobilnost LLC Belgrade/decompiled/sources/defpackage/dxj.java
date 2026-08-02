package defpackage;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;

/* loaded from: classes10.dex */
public final class dxj extends exj {
    public final /* synthetic */ int d;

    @Override // defpackage.exj
    public final boolean a() {
        switch (this.d) {
            case 0:
                return true;
            case 1:
                return false;
            case 2:
                return true;
            case 3:
                return false;
            default:
                return true;
        }
    }

    @Override // defpackage.exj
    public final boolean b() {
        switch (this.d) {
        }
        return true;
    }

    @Override // defpackage.exj
    public final boolean c(DataSource dataSource) {
        switch (this.d) {
            case 0:
                if (dataSource == DataSource.REMOTE) {
                }
                break;
            case 1:
                break;
            case 2:
                if (dataSource == DataSource.DATA_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) {
                }
                break;
            case 3:
                break;
            default:
                if (dataSource == DataSource.REMOTE) {
                }
                break;
        }
        return false;
    }

    @Override // defpackage.exj
    public final boolean d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
        switch (this.d) {
            case 0:
                if (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) {
                }
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                if (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) {
                }
                break;
            default:
                if (((!z || dataSource != DataSource.DATA_DISK_CACHE) && dataSource != DataSource.LOCAL) || encodeStrategy != EncodeStrategy.TRANSFORMED) {
                }
                break;
        }
        return false;
    }
}
