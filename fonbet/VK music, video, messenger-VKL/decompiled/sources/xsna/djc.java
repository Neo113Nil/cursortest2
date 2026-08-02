package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.games.model.GamesHeaderSectionInfo;

/* compiled from: ClickItem.kt */
/* loaded from: classes17.dex */
public abstract class djc {

    /* compiled from: ClickItem.kt */
    public static final class a extends djc {
        public final String a;

        public a(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("AchievementClickItem(sectionTrackCode="), this.a, ')');
        }
    }

    /* compiled from: ClickItem.kt */
    public static final class b extends djc {
        public final sbt a;
        public final Integer b;
        public final Integer c;
        public final String d;

        public b(sbt sbtVar, Integer num, Integer num2, String str) {
            this.a = sbtVar;
            this.b = num;
            this.c = num2;
            this.d = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            Integer num = this.b;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.c;
            int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str = this.d;
            return hashCode3 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AppClickedItem(app=");
            sb.append(this.a);
            sb.append(", innerIndex=");
            sb.append(this.b);
            sb.append(", requestId=");
            sb.append(this.c);
            sb.append(", requestKey=");
            return ho8.a(sb, this.d, ')');
        }
    }

    /* compiled from: ClickItem.kt */
    public static final class c extends djc {
        public final GamesHeaderSectionInfo a;
        public final String b;

        public c(GamesHeaderSectionInfo gamesHeaderSectionInfo, String str) {
            this.a = gamesHeaderSectionInfo;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SectionClick(sectionInfo=");
            sb.append(this.a);
            sb.append(", sectionTrackCode=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: ClickItem.kt */
    public static final class d extends djc {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -2019168746;
        }

        public final String toString() {
            return "Stub";
        }
    }

    /* compiled from: ClickItem.kt */
    public static final class e extends djc {
        public final String a;
        public final String b;

        public e(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.a, eVar.a) && epx.f(this.b, eVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            return (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UrlClickItem(url=");
            sb.append(this.a);
            sb.append(", sectionTrackCode=");
            return i5s.a(sb, this.b, ", innerIndex=null)");
        }
    }

    /* compiled from: ClickItem.kt */
    public static final class f extends djc {
        public final UserId a;

        public f(UserId userId) {
            this.a = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.a, ((f) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("UserClickItem(userId="), this.a, ')');
        }
    }

    /* compiled from: ClickItem.kt */
    public static final class g extends djc {
        public final String a;
        public final nkx0 b;

        public g(String str, nkx0 nkx0Var) {
            this.a = str;
            this.b = nkx0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return epx.f(this.a, gVar.a) && epx.f(this.b, gVar.b);
        }

        public final int hashCode() {
            String str = this.a;
            return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            return "WhatInsideModalClickItem(sectionTrackCode=" + this.a + ", modalInfo=" + this.b + ')';
        }
    }
}
