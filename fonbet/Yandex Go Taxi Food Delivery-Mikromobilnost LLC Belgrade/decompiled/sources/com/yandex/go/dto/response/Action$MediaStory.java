package com.yandex.go.dto.response;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jn;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/dto/response/Action$MediaStory", "Lcom/yandex/go/dto/response/q1;", "Companion", "Prefetch", "$serializer", "com/yandex/go/dto/response/a0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Action$MediaStory extends q1 {
    public static final a0 Companion = new a0();
    public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jn(10))};
    public final Action$Media a;
    public final Prefetch b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/dto/response/Action$MediaStory$Prefetch;", "", "Companion", "com/yandex/go/dto/response/b0", "ONLY_JSON", "IMAGES", "ALL_MEDIA", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Prefetch {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Prefetch[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final Prefetch ALL_MEDIA;
        public static final b0 Companion;
        public static final Prefetch IMAGES;
        public static final Prefetch ONLY_JSON;

        static {
            Prefetch prefetch = new Prefetch("ONLY_JSON", 0);
            ONLY_JSON = prefetch;
            Prefetch prefetch2 = new Prefetch("IMAGES", 1);
            IMAGES = prefetch2;
            Prefetch prefetch3 = new Prefetch("ALL_MEDIA", 2);
            ALL_MEDIA = prefetch3;
            Prefetch[] prefetchArr = {prefetch, prefetch2, prefetch3};
            $VALUES = prefetchArr;
            $ENTRIES = kotlin.enums.a.a(prefetchArr);
            Companion = new b0();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jn(11));
        }

        public static Prefetch valueOf(String str) {
            return (Prefetch) Enum.valueOf(Prefetch.class, str);
        }

        public static Prefetch[] values() {
            return (Prefetch[]) $VALUES.clone();
        }
    }

    public Action$MediaStory(int i, Action$Media action$Media, Prefetch prefetch) {
        this.a = (i & 1) == 0 ? new Action$Media(0) : action$Media;
        if ((i & 2) == 0) {
            this.b = Prefetch.IMAGES;
        } else {
            this.b = prefetch;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Action$MediaStory)) {
            return false;
        }
        Action$MediaStory action$MediaStory = (Action$MediaStory) obj;
        return jl40.l(this.a, action$MediaStory.a) && this.b == action$MediaStory.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MediaStory(media=" + this.a + ", prefetch=" + this.b + Extension.C_BRAKE;
    }

    public Action$MediaStory() {
        Action$Media action$Media = new Action$Media(0);
        Prefetch prefetch = Prefetch.IMAGES;
        this.a = action$Media;
        this.b = prefetch;
    }
}
