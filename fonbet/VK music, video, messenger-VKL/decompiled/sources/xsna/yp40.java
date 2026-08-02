package xsna;

import com.vk.catalog2.feature.music.offline.content.OfflineCatalogCategories;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: MusicOfflineCatalogDurationsData.kt */
/* loaded from: classes16.dex */
public final class yp40 {
    public static final yp40 h = new yp40(0, 0, 0, 0, 0, 0);
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;

    /* compiled from: MusicOfflineCatalogDurationsData.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OfflineCatalogCategories.values().length];
            try {
                iArr[OfflineCatalogCategories.All.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OfflineCatalogCategories.Tracks.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OfflineCatalogCategories.AutoDownload.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OfflineCatalogCategories.Playlists.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OfflineCatalogCategories.Albums.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[OfflineCatalogCategories.Podcasts.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[OfflineCatalogCategories.Audiobooks.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public yp40(long j, long j2, long j3, long j4, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j + j2 + j3 + j4 + j5 + j6;
    }

    public final long a(OfflineCatalogCategories offlineCatalogCategories) {
        switch (a.$EnumSwitchMapping$0[offlineCatalogCategories.ordinal()]) {
            case 1:
                return this.g;
            case 2:
                return this.a;
            case 3:
                return this.b;
            case 4:
                return this.c;
            case 5:
                return this.d;
            case 6:
                return this.e;
            case 7:
                return this.f;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yp40)) {
            return false;
        }
        yp40 yp40Var = (yp40) obj;
        return this.a == yp40Var.a && this.b == yp40Var.b && this.c == yp40Var.c && this.d == yp40Var.d && this.e == yp40Var.e && this.f == yp40Var.f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + bh10.a(bh10.a(bh10.a(bh10.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MusicOfflineCatalogDurationsData(tracksDurationMs=");
        sb.append(this.a);
        sb.append(", autoDownloadDurationMs=");
        sb.append(this.b);
        sb.append(", playlistsDurationMs=");
        sb.append(this.c);
        sb.append(", albumsDurationMs=");
        sb.append(this.d);
        sb.append(", podcastsDurationMs=");
        sb.append(this.e);
        sb.append(", audioBooksDurationMs=");
        return vu5.a(')', this.f, sb);
    }
}
