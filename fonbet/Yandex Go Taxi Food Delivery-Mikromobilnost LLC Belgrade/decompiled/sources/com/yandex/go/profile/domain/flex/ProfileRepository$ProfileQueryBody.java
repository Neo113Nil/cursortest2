package com.yandex.go.profile.domain.flex;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.qje;
import defpackage.rpe0;
import defpackage.unr0;
import defpackage.zzs;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/profile/domain/flex/ProfileRepository$ProfileQueryBody", "", "Companion", "State", "$serializer", "com/yandex/go/profile/domain/flex/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ProfileRepository$ProfileQueryBody {
    public static final b Companion = new b();
    public static final i3y[] f = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new rpe0(27)), null};
    public final zzs a;
    public final String b;
    public final String c;
    public final Set d;
    public final State e;

    public /* synthetic */ ProfileRepository$ProfileQueryBody(int i, zzs zzsVar, String str, String str2, Set set, State state) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, ProfileRepository$ProfileQueryBody$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = zzsVar;
        this.b = str;
        this.c = str2;
        this.d = set;
        if ((i & 16) == 0) {
            this.e = new State(null, null);
        } else {
            this.e = state;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/profile/domain/flex/ProfileRepository$ProfileQueryBody$State;", "", "Companion", "$serializer", "com/yandex/go/profile/domain/flex/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class State {
        public static final c Companion = new c();
        public final String a;
        public final String b;

        public /* synthetic */ State(int i, String str, String str2) {
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
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return jl40.l(this.a, state.a) && jl40.l(this.b, state.b);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return unr0.p("State(ultimaMode=", this.a, ", ultimaAppearanceState=", this.b, Extension.C_BRAKE);
        }

        public State(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public State() {
            this(null, null);
        }
    }

    public ProfileRepository$ProfileQueryBody(zzs zzsVar, String str, String str2, Set set, State state) {
        this.a = zzsVar;
        this.b = str;
        this.c = str2;
        this.d = set;
        this.e = state;
    }
}
