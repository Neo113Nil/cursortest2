package com.yandex.go.shortcuts.dto.response;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.oyr;
import defpackage.p73;
import defpackage.scc;
import defpackage.tse0;
import defpackage.yjd;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/BackgroundFraming;", "", "Companion", "Frame", "$serializer", "com/yandex/go/shortcuts/dto/response/m", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class BackgroundFraming {
    public static final m Companion = new m();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new p73(24))};
    public final List a;

    public /* synthetic */ BackgroundFraming(int i, List list) {
        if ((i & 1) == 0) {
            this.a = EmptyList.a;
        } else {
            this.a = list;
        }
    }

    public static final /* synthetic */ void b(BackgroundFraming backgroundFraming, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (!yjdVar.F() && jl40.l(backgroundFraming.a, EmptyList.a)) {
            return;
        }
        yjdVar.e(serialDescriptor, 0, (KSerializer) b[0].getValue(), backgroundFraming.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BackgroundFraming) && jl40.l(this.a, ((BackgroundFraming) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("BackgroundFraming(frames=", Extension.C_BRAKE, this.a);
    }

    public BackgroundFraming(int i) {
        this.a = EmptyList.a;
    }

    public BackgroundFraming() {
        this(0);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/BackgroundFraming$Frame;", "", "Companion", "$serializer", "com/yandex/go/shortcuts/dto/response/n", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Frame {
        public static final n Companion = new n();
        public static final i3y[] d = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new p73(25))};
        public final int a;
        public final int b;
        public final List c;

        public /* synthetic */ Frame(int i, int i2, int i3, List list) {
            Float valueOf = Float.valueOf(0.5f);
            if ((i & 1) == 0) {
                this.a = 2;
            } else {
                this.a = i2;
            }
            if ((i & 2) == 0) {
                this.b = 2;
            } else {
                this.b = i3;
            }
            if ((i & 4) == 0) {
                this.c = scc.g(valueOf, valueOf);
            } else {
                this.c = list;
            }
        }

        public static final /* synthetic */ void b(Frame frame, yjd yjdVar, SerialDescriptor serialDescriptor) {
            Float valueOf = Float.valueOf(0.5f);
            if (yjdVar.F() || frame.a != 2) {
                yjdVar.A(0, frame.a, serialDescriptor);
            }
            if (yjdVar.F() || frame.b != 2) {
                yjdVar.A(1, frame.b, serialDescriptor);
            }
            if (!yjdVar.F() && jl40.l(frame.c, scc.g(valueOf, valueOf))) {
                return;
            }
            yjdVar.e(serialDescriptor, 2, (KSerializer) d[2].getValue(), frame.c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Frame)) {
                return false;
            }
            Frame frame = (Frame) obj;
            return this.a == frame.a && this.b == frame.b && jl40.l(this.c, frame.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + oyr.b(this.b, Integer.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            return ly3.s(b64.s(this.a, this.b, "Frame(width=", ", height=", ", anchor="), this.c, Extension.C_BRAKE);
        }

        public Frame() {
            Float valueOf = Float.valueOf(0.5f);
            List g = scc.g(valueOf, valueOf);
            this.a = 2;
            this.b = 2;
            this.c = g;
        }
    }
}
