package com.yandex.go.copter.city_tour.api;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.n;
import defpackage.qlb;
import defpackage.unr0;
import defpackage.xvz;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/copter/city_tour/api/CityToursResponse;", "", "Companion", "Choice", "$serializer", "com/yandex/go/copter/city_tour/api/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CityToursResponse {
    public static final d Companion = new d();
    public static final i3y[] e = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new qlb(25))};
    public final String a;
    public final FormattedText b;
    public final FormattedText c;
    public final List d;

    public /* synthetic */ CityToursResponse(int i, String str, FormattedText formattedText, FormattedText formattedText2, List list) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = formattedText;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = formattedText2;
        }
        if ((i & 8) == 0) {
            this.d = EmptyList.a;
        } else {
            this.d = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CityToursResponse)) {
            return false;
        }
        CityToursResponse cityToursResponse = (CityToursResponse) obj;
        return jl40.l(this.a, cityToursResponse.a) && jl40.l(this.b, cityToursResponse.b) && jl40.l(this.c, cityToursResponse.c) && jl40.l(this.d, cityToursResponse.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        FormattedText formattedText = this.b;
        int hashCode2 = (hashCode + (formattedText == null ? 0 : formattedText.a.hashCode())) * 31;
        FormattedText formattedText2 = this.c;
        return this.d.hashCode() + ((hashCode2 + (formattedText2 != null ? formattedText2.a.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder q = xvz.q("CityToursResponse(screenName=", this.a, ", title=", ", subtitle=", this.b);
        q.append(this.c);
        q.append(", choices=");
        q.append(this.d);
        q.append(Extension.C_BRAKE);
        return q.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/copter/city_tour/api/CityToursResponse$Choice;", "", "Companion", "TourPoint", "$serializer", "com/yandex/go/copter/city_tour/api/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Choice {
        public static final b Companion = new b();
        public static final i3y[] g = {null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new qlb(26)), null};
        public final Integer a;
        public final String b;
        public final FormattedText c;
        public final FormattedText d;
        public final List e;
        public final String f;

        public /* synthetic */ Choice(int i, Integer num, String str, FormattedText formattedText, FormattedText formattedText2, List list, String str2) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = num;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = formattedText;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = formattedText2;
            }
            if ((i & 16) == 0) {
                this.e = EmptyList.a;
            } else {
                this.e = list;
            }
            if ((i & 32) == 0) {
                this.f = null;
            } else {
                this.f = str2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Choice)) {
                return false;
            }
            Choice choice = (Choice) obj;
            return jl40.l(this.a, choice.a) && jl40.l(this.b, choice.b) && jl40.l(this.c, choice.c) && jl40.l(this.d, choice.d) && jl40.l(this.e, choice.e) && jl40.l(this.f, choice.f);
        }

        public final int hashCode() {
            Integer num = this.a;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            FormattedText formattedText = this.c;
            int hashCode3 = (hashCode2 + (formattedText == null ? 0 : formattedText.a.hashCode())) * 31;
            FormattedText formattedText2 = this.d;
            int c = unr0.c((hashCode3 + (formattedText2 == null ? 0 : formattedText2.a.hashCode())) * 31, 31, this.e);
            String str2 = this.f;
            return c + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Choice(requirementOption=");
            sb.append(this.a);
            sb.append(", imageUrl=");
            sb.append(this.b);
            sb.append(", title=");
            n.C(sb, this.c, ", subtitle=", this.d, ", route=");
            return n.l(", routeDescription=", this.f, Extension.C_BRAKE, sb, this.e);
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/copter/city_tour/api/CityToursResponse$Choice$TourPoint;", "", "Companion", "$serializer", "com/yandex/go/copter/city_tour/api/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final /* data */ class TourPoint {
            public static final c Companion = new c();
            public final Double a;
            public final Double b;

            public /* synthetic */ TourPoint(int i, Double d, Double d2) {
                if ((i & 1) == 0) {
                    this.a = null;
                } else {
                    this.a = d;
                }
                if ((i & 2) == 0) {
                    this.b = null;
                } else {
                    this.b = d2;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TourPoint)) {
                    return false;
                }
                TourPoint tourPoint = (TourPoint) obj;
                return jl40.l(this.a, tourPoint.a) && jl40.l(this.b, tourPoint.b);
            }

            public final int hashCode() {
                Double d = this.a;
                int hashCode = (d == null ? 0 : d.hashCode()) * 31;
                Double d2 = this.b;
                return hashCode + (d2 != null ? d2.hashCode() : 0);
            }

            public final String toString() {
                return "TourPoint(lat=" + this.a + ", lon=" + this.b + Extension.C_BRAKE;
            }

            public TourPoint() {
                this.a = null;
                this.b = null;
            }
        }

        public Choice() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = EmptyList.a;
            this.f = null;
        }
    }

    public CityToursResponse() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = EmptyList.a;
    }
}
