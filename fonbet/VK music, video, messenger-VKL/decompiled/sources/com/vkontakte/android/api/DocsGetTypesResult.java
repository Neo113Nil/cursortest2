package com.vkontakte.android.api;

import com.vk.api.base.Document;
import com.vk.api.base.VkPaginationList;
import com.vkontakte.android.R;
import defpackage.q0;
import java.util.ArrayList;
import xsna.asp;
import xsna.epx;
import xsna.qr;
import xsna.vu5;
import xsna.zrp;

/* compiled from: DocsGetTypesResult.kt */
/* loaded from: classes7.dex */
public final class DocsGetTypesResult {
    public final VkPaginationList<Document> a;
    public final ArrayList b;
    public final boolean c;

    /* compiled from: DocsGetTypesResult.kt */
    public static final class DocType {
        public final Type a;
        public final int b;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: DocsGetTypesResult.kt */
        public static final class Type {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;
            public static final Type ALL;
            public static final Type ARCHIVES;
            public static final a Companion;
            public static final Type EBOOKS;
            public static final Type GIFS;
            public static final Type IMAGES;
            public static final Type MUSIC;
            public static final Type OTHERS;
            public static final Type TEXTS;
            public static final Type VIDEOS;
            private final int id;
            private final int titleRes;

            /* compiled from: DocsGetTypesResult.kt */
            public static final class a {
                public static Type a(int i) {
                    Type type;
                    Type[] values = Type.values();
                    int length = values.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            type = null;
                            break;
                        }
                        type = values[i2];
                        if (type.h() == i) {
                            break;
                        }
                        i2++;
                    }
                    if (type != null) {
                        return type;
                    }
                    throw new IllegalArgumentException();
                }
            }

            static {
                Type type = new Type("ALL", 0, -1, R.string.documents_type_all);
                ALL = type;
                Type type2 = new Type("TEXTS", 1, 1, R.string.documents_type_texts);
                TEXTS = type2;
                Type type3 = new Type("ARCHIVES", 2, 2, R.string.documents_type_archives);
                ARCHIVES = type3;
                Type type4 = new Type("GIFS", 3, 3, R.string.documents_type_gifs);
                GIFS = type4;
                Type type5 = new Type("IMAGES", 4, 4, R.string.documents_type_images);
                IMAGES = type5;
                Type type6 = new Type("MUSIC", 5, 5, R.string.documents_type_music);
                MUSIC = type6;
                Type type7 = new Type("VIDEOS", 6, 6, R.string.documents_type_videos);
                VIDEOS = type7;
                Type type8 = new Type("EBOOKS", 7, 7, R.string.documents_type_ebooks);
                EBOOKS = type8;
                Type type9 = new Type("OTHERS", 8, 8, R.string.documents_type_other);
                OTHERS = type9;
                Type[] typeArr = {type, type2, type3, type4, type5, type6, type7, type8, type9};
                $VALUES = typeArr;
                $ENTRIES = new asp(typeArr);
                Companion = new a();
            }

            public Type(String str, int i, int i2, int i3) {
                this.id = i2;
                this.titleRes = i3;
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }

            public final int h() {
                return this.id;
            }

            public final int i() {
                return this.titleRes;
            }
        }

        public DocType(Type type, int i) {
            this.a = type;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DocType)) {
                return false;
            }
            DocType docType = (DocType) obj;
            return this.a == docType.a && this.b == docType.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DocType(type=");
            sb.append(this.a);
            sb.append(", count=");
            return vu5.b(sb, this.b, ')');
        }
    }

    public DocsGetTypesResult(VkPaginationList vkPaginationList, ArrayList arrayList, boolean z) {
        this.a = vkPaginationList;
        this.b = arrayList;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DocsGetTypesResult)) {
            return false;
        }
        DocsGetTypesResult docsGetTypesResult = (DocsGetTypesResult) obj;
        return epx.f(this.a, docsGetTypesResult.a) && epx.f(this.b, docsGetTypesResult.b) && this.c == docsGetTypesResult.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + qr.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DocsGetTypesResult(docs=");
        sb.append(this.a);
        sb.append(", docTypes=");
        sb.append(this.b);
        sb.append(", canAdd=");
        return q0.a(sb, this.c, ')');
    }

    public DocsGetTypesResult() {
        this(new VkPaginationList(null, 0, false, 0, 15, null), new ArrayList(), false);
    }
}
