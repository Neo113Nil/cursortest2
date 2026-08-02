package com.yandex.go.address.address_map_picker.data;

import defpackage.bvf0;
import defpackage.ffx;
import defpackage.k4o;
import defpackage.mth;
import defpackage.yve;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class AddressMapPickerAddressStateRepository {
    public final r0 a;
    public final n0 b;
    public final r0 c;
    public final mth d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/address/address_map_picker/data/AddressMapPickerAddressStateRepository$State;", "", "Default", "Loading", "Loaded", "Error", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class State {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State Default;
        public static final State Error;
        public static final State Loaded;
        public static final State Loading;

        static {
            State state = new State("Default", 0);
            Default = state;
            State state2 = new State("Loading", 1);
            Loading = state2;
            State state3 = new State("Loaded", 2);
            Loaded = state3;
            State state4 = new State("Error", 3);
            Error = state4;
            State[] stateArr = {state, state2, state3, state4};
            $VALUES = stateArr;
            $ENTRIES = a.a(stateArr);
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    public AddressMapPickerAddressStateRepository() {
        r0 c = bvf0.c(State.Default);
        this.a = c;
        n0 c2 = ffx.c(1, 0, null, 6);
        this.b = c2;
        this.c = c;
        this.d = new mth(c2, 6);
    }

    public static void a(AddressMapPickerAddressStateRepository addressMapPickerAddressStateRepository, zzs zzsVar) {
        addressMapPickerAddressStateRepository.b.g(new yve(zzsVar, null));
    }

    public final void b(State state) {
        this.a.l(state);
    }
}
