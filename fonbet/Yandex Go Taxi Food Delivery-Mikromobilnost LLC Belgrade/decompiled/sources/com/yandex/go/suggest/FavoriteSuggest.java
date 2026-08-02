package com.yandex.go.suggest;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.thp;
import defpackage.unr0;
import defpackage.xvz;
import defpackage.zzs;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/suggest/FavoriteSuggest;", "", "Companion", "FavoritePointSuggest", "FavoriteInfoSuggest", "$serializer", "com/yandex/go/suggest/b", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class FavoriteSuggest {
    public static final b Companion = new b();
    public final FavoritePointSuggest a;
    public final FavoriteInfoSuggest b;

    public /* synthetic */ FavoriteSuggest(int i, FavoritePointSuggest favoritePointSuggest, FavoriteInfoSuggest favoriteInfoSuggest) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = favoritePointSuggest;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = favoriteInfoSuggest;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FavoriteSuggest)) {
            return false;
        }
        FavoriteSuggest favoriteSuggest = (FavoriteSuggest) obj;
        return jl40.l(this.a, favoriteSuggest.a) && jl40.l(this.b, favoriteSuggest.b);
    }

    public final int hashCode() {
        FavoritePointSuggest favoritePointSuggest = this.a;
        int hashCode = (favoritePointSuggest == null ? 0 : favoritePointSuggest.hashCode()) * 31;
        FavoriteInfoSuggest favoriteInfoSuggest = this.b;
        return hashCode + (favoriteInfoSuggest != null ? favoriteInfoSuggest.hashCode() : 0);
    }

    public final String toString() {
        return "FavoriteSuggest(point=" + this.a + ", info=" + this.b + Extension.C_BRAKE;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/suggest/FavoriteSuggest$FavoriteInfoSuggest;", "", "Companion", "FavoriteTimeInfoSuggest", "$serializer", "com/yandex/go/suggest/c", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class FavoriteInfoSuggest {
        public static final c Companion = new c();
        public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new thp(0)), null};
        public final String a;
        public final List b;
        public final FavoriteTimeInfoSuggest c;

        public /* synthetic */ FavoriteInfoSuggest(int i, String str, List list, FavoriteTimeInfoSuggest favoriteTimeInfoSuggest) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = list;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = favoriteTimeInfoSuggest;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FavoriteInfoSuggest)) {
                return false;
            }
            FavoriteInfoSuggest favoriteInfoSuggest = (FavoriteInfoSuggest) obj;
            return jl40.l(this.a, favoriteInfoSuggest.a) && jl40.l(this.b, favoriteInfoSuggest.b) && jl40.l(this.c, favoriteInfoSuggest.c);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            List list = this.b;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            FavoriteTimeInfoSuggest favoriteTimeInfoSuggest = this.c;
            return hashCode2 + (favoriteTimeInfoSuggest != null ? favoriteTimeInfoSuggest.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder r = xvz.r("FavoriteInfoSuggest(lastOrderId=", this.a, ", availableTypes=", this.b, ", timeInfo=");
            r.append(this.c);
            r.append(Extension.C_BRAKE);
            return r.toString();
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/suggest/FavoriteSuggest$FavoriteInfoSuggest$FavoriteTimeInfoSuggest;", "", "Companion", "$serializer", "com/yandex/go/suggest/d", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final /* data */ class FavoriteTimeInfoSuggest {
            public static final d Companion = new d();
            public final String a;
            public final String b;

            public /* synthetic */ FavoriteTimeInfoSuggest(int i, String str, String str2) {
                if ((i & 1) == 0) {
                    this.a = null;
                } else {
                    this.a = str;
                }
                if ((i & 2) == 0) {
                    this.b = null;
                } else {
                    this.b = str2;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof FavoriteTimeInfoSuggest)) {
                    return false;
                }
                FavoriteTimeInfoSuggest favoriteTimeInfoSuggest = (FavoriteTimeInfoSuggest) obj;
                return jl40.l(this.a, favoriteTimeInfoSuggest.a) && jl40.l(this.b, favoriteTimeInfoSuggest.b);
            }

            public final int hashCode() {
                String str = this.a;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.b;
                return hashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                return unr0.p("FavoriteTimeInfoSuggest(shortText=", this.a, ", fullText=", this.b, Extension.C_BRAKE);
            }

            public FavoriteTimeInfoSuggest() {
                this.a = null;
                this.b = null;
            }
        }

        public FavoriteInfoSuggest() {
            this.a = null;
            this.b = null;
            this.c = null;
        }
    }

    public FavoriteSuggest() {
        this.a = null;
        this.b = null;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/suggest/FavoriteSuggest$FavoritePointSuggest;", "", "Companion", "$serializer", "com/yandex/go/suggest/e", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class FavoritePointSuggest {
        public static final e Companion = new e();
        public final String a;
        public final String b;
        public final zzs c;
        public final String d;

        public /* synthetic */ FavoritePointSuggest(int i, zzs zzsVar, String str, String str2, String str3) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = zzsVar;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = str3;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FavoritePointSuggest)) {
                return false;
            }
            FavoritePointSuggest favoritePointSuggest = (FavoritePointSuggest) obj;
            return jl40.l(this.a, favoritePointSuggest.a) && jl40.l(this.b, favoritePointSuggest.b) && jl40.l(this.c, favoritePointSuggest.c) && jl40.l(this.d, favoritePointSuggest.d);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            zzs zzsVar = this.c;
            int hashCode3 = (hashCode2 + (zzsVar == null ? 0 : zzsVar.hashCode())) * 31;
            String str3 = this.d;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder v = b64.v("FavoritePointSuggest(title=", this.a, ", subtitle=", this.b, ", coordinates=");
            v.append(this.c);
            v.append(", uri=");
            v.append(this.d);
            v.append(Extension.C_BRAKE);
            return v.toString();
        }

        public FavoritePointSuggest() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
        }
    }
}
