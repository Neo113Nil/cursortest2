package com.yandex.go.shortcuts.dto.response;

import defpackage.auu0;
import defpackage.en60;
import defpackage.gsq0;
import defpackage.h6w;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.nor;
import defpackage.p73;
import defpackage.yjd;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"com/yandex/go/shortcuts/dto/response/BackgroundAnimation$PulseCirclesAnimation", "Lcom/yandex/go/shortcuts/dto/response/l;", "Companion", "Source", "SourceAnchor", "SourceAnchorPoint", "$serializer", "com/yandex/go/shortcuts/dto/response/g", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class BackgroundAnimation$PulseCirclesAnimation extends l {
    public static final g Companion = new g();
    public final String a;
    public final Integer b;
    public final Number c;
    public final Source d;

    public BackgroundAnimation$PulseCirclesAnimation(int i, String str, Integer num, Number number, Source source) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = number;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = source;
        }
    }

    public static final /* synthetic */ void a(BackgroundAnimation$PulseCirclesAnimation backgroundAnimation$PulseCirclesAnimation, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || !jl40.l(backgroundAnimation$PulseCirclesAnimation.a, "")) {
            yjdVar.g(serialDescriptor, 0, auu0.a, backgroundAnimation$PulseCirclesAnimation.a);
        }
        if (yjdVar.F() || backgroundAnimation$PulseCirclesAnimation.b != null) {
            yjdVar.g(serialDescriptor, 1, h6w.a, backgroundAnimation$PulseCirclesAnimation.b);
        }
        if (yjdVar.F() || backgroundAnimation$PulseCirclesAnimation.c != null) {
            yjdVar.g(serialDescriptor, 2, en60.a, backgroundAnimation$PulseCirclesAnimation.c);
        }
        if (!yjdVar.F() && backgroundAnimation$PulseCirclesAnimation.d == null) {
            return;
        }
        yjdVar.g(serialDescriptor, 3, BackgroundAnimation$PulseCirclesAnimation$Source$$serializer.INSTANCE, backgroundAnimation$PulseCirclesAnimation.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BackgroundAnimation$PulseCirclesAnimation)) {
            return false;
        }
        BackgroundAnimation$PulseCirclesAnimation backgroundAnimation$PulseCirclesAnimation = (BackgroundAnimation$PulseCirclesAnimation) obj;
        return jl40.l(this.a, backgroundAnimation$PulseCirclesAnimation.a) && jl40.l(this.b, backgroundAnimation$PulseCirclesAnimation.b) && jl40.l(this.c, backgroundAnimation$PulseCirclesAnimation.c) && jl40.l(this.d, backgroundAnimation$PulseCirclesAnimation.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Number number = this.c;
        int hashCode3 = (hashCode2 + (number == null ? 0 : number.hashCode())) * 31;
        Source source = this.d;
        return hashCode3 + (source != null ? source.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder q = defpackage.n.q("PulseCirclesAnimation(id=", this.b, this.a, ", count=", ", startDelay=");
        q.append(this.c);
        q.append(", source=");
        q.append(this.d);
        q.append(Extension.C_BRAKE);
        return q.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/BackgroundAnimation$PulseCirclesAnimation$SourceAnchor;", "", "Companion", "$serializer", "com/yandex/go/shortcuts/dto/response/i", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class SourceAnchor {
        public static final i Companion = new i();
        public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new p73(22)), null};
        public final Shape a;
        public final SourceAnchorPoint b;

        public /* synthetic */ SourceAnchor(int i, Shape shape, SourceAnchorPoint sourceAnchorPoint) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = shape;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = sourceAnchorPoint;
            }
        }

        public static final /* synthetic */ void b(SourceAnchor sourceAnchor, yjd yjdVar, SerialDescriptor serialDescriptor) {
            if (yjdVar.F() || sourceAnchor.a != null) {
                yjdVar.g(serialDescriptor, 0, (KSerializer) c[0].getValue(), sourceAnchor.a);
            }
            if (!yjdVar.F() && sourceAnchor.b == null) {
                return;
            }
            yjdVar.g(serialDescriptor, 1, BackgroundAnimation$PulseCirclesAnimation$SourceAnchorPoint$$serializer.INSTANCE, sourceAnchor.b);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SourceAnchor)) {
                return false;
            }
            SourceAnchor sourceAnchor = (SourceAnchor) obj;
            return this.a == sourceAnchor.a && jl40.l(this.b, sourceAnchor.b);
        }

        public final int hashCode() {
            Shape shape = this.a;
            int hashCode = (shape == null ? 0 : shape.hashCode()) * 31;
            SourceAnchorPoint sourceAnchorPoint = this.b;
            return hashCode + (sourceAnchorPoint != null ? sourceAnchorPoint.hashCode() : 0);
        }

        public final String toString() {
            return "SourceAnchor(anchorShape=" + this.a + ", point=" + this.b + Extension.C_BRAKE;
        }

        public SourceAnchor() {
            this.a = null;
            this.b = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/BackgroundAnimation$PulseCirclesAnimation$SourceAnchorPoint;", "", "Companion", "$serializer", "com/yandex/go/shortcuts/dto/response/j", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class SourceAnchorPoint {
        public static final j Companion = new j();
        public final Float a;
        public final Float b;

        public /* synthetic */ SourceAnchorPoint(int i, Float f, Float f2) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = f;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = f2;
            }
        }

        public static final /* synthetic */ void a(SourceAnchorPoint sourceAnchorPoint, yjd yjdVar, SerialDescriptor serialDescriptor) {
            if (yjdVar.F() || sourceAnchorPoint.a != null) {
                yjdVar.g(serialDescriptor, 0, nor.a, sourceAnchorPoint.a);
            }
            if (!yjdVar.F() && sourceAnchorPoint.b == null) {
                return;
            }
            yjdVar.g(serialDescriptor, 1, nor.a, sourceAnchorPoint.b);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SourceAnchorPoint)) {
                return false;
            }
            SourceAnchorPoint sourceAnchorPoint = (SourceAnchorPoint) obj;
            return jl40.l(this.a, sourceAnchorPoint.a) && jl40.l(this.b, sourceAnchorPoint.b);
        }

        public final int hashCode() {
            Float f = this.a;
            int hashCode = (f == null ? 0 : f.hashCode()) * 31;
            Float f2 = this.b;
            return hashCode + (f2 != null ? f2.hashCode() : 0);
        }

        public final String toString() {
            return "SourceAnchorPoint(x=" + this.a + ", y=" + this.b + Extension.C_BRAKE;
        }

        public SourceAnchorPoint() {
            this.a = null;
            this.b = null;
        }
    }

    public BackgroundAnimation$PulseCirclesAnimation() {
        this.a = "";
        this.b = null;
        this.c = null;
        this.d = null;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/BackgroundAnimation$PulseCirclesAnimation$Source;", "", "Companion", "$serializer", "com/yandex/go/shortcuts/dto/response/h", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Source {
        public static final h Companion = new h();
        public final String a;
        public final Number b;
        public final Number c;
        public final Integer d;
        public final SourceAnchor e;

        public /* synthetic */ Source(int i, String str, Number number, Number number2, Integer num, SourceAnchor sourceAnchor) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = number;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = number2;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = num;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = sourceAnchor;
            }
        }

        public static final /* synthetic */ void a(Source source, yjd yjdVar, SerialDescriptor serialDescriptor) {
            if (yjdVar.F() || source.a != null) {
                yjdVar.g(serialDescriptor, 0, auu0.a, source.a);
            }
            if (yjdVar.F() || source.b != null) {
                yjdVar.g(serialDescriptor, 1, en60.a, source.b);
            }
            if (yjdVar.F() || source.c != null) {
                yjdVar.g(serialDescriptor, 2, en60.a, source.c);
            }
            if (yjdVar.F() || source.d != null) {
                yjdVar.g(serialDescriptor, 3, h6w.a, source.d);
            }
            if (!yjdVar.F() && source.e == null) {
                return;
            }
            yjdVar.g(serialDescriptor, 4, BackgroundAnimation$PulseCirclesAnimation$SourceAnchor$$serializer.INSTANCE, source.e);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Source)) {
                return false;
            }
            Source source = (Source) obj;
            return jl40.l(this.a, source.a) && jl40.l(this.b, source.b) && jl40.l(this.c, source.c) && jl40.l(this.d, source.d) && jl40.l(this.e, source.e);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Number number = this.b;
            int hashCode2 = (hashCode + (number == null ? 0 : number.hashCode())) * 31;
            Number number2 = this.c;
            int hashCode3 = (hashCode2 + (number2 == null ? 0 : number2.hashCode())) * 31;
            Integer num = this.d;
            int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            SourceAnchor sourceAnchor = this.e;
            return hashCode4 + (sourceAnchor != null ? sourceAnchor.hashCode() : 0);
        }

        public final String toString() {
            return "Source(color=" + this.a + ", duration=" + this.b + ", delayPerCircle=" + this.c + ", circleCount=" + this.d + ", anchorShape=" + this.e + Extension.C_BRAKE;
        }

        public Source() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
        }
    }
}
