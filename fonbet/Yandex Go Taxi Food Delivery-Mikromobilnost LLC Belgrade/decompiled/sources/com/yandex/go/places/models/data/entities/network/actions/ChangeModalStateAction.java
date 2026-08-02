package com.yandex.go.places.models.data.entities.network.actions;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.kr;
import defpackage.qje;
import defpackage.we8;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/places/models/data/entities/network/actions/ChangeModalStateAction;", "Lkr;", "Companion", "ModalState", "$serializer", "com/yandex/go/places/models/data/entities/network/actions/b", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ChangeModalStateAction extends kr {
    public static final b Companion = new b();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new we8(25))};
    public final ModalState a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/models/data/entities/network/actions/ChangeModalStateAction$ModalState;", "", "Expanded", "Anchored", "Collapsed", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class ModalState {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ModalState[] $VALUES;
        public static final ModalState Anchored;
        public static final ModalState Collapsed;
        public static final ModalState Expanded;

        static {
            ModalState modalState = new ModalState("Expanded", 0);
            Expanded = modalState;
            ModalState modalState2 = new ModalState("Anchored", 1);
            Anchored = modalState2;
            ModalState modalState3 = new ModalState("Collapsed", 2);
            Collapsed = modalState3;
            ModalState[] modalStateArr = {modalState, modalState2, modalState3};
            $VALUES = modalStateArr;
            $ENTRIES = kotlin.enums.a.a(modalStateArr);
        }

        public static ModalState valueOf(String str) {
            return (ModalState) Enum.valueOf(ModalState.class, str);
        }

        public static ModalState[] values() {
            return (ModalState[]) $VALUES.clone();
        }
    }

    public /* synthetic */ ChangeModalStateAction(int i, ModalState modalState) {
        if (1 == (i & 1)) {
            this.a = modalState;
        } else {
            qje.Z(i, 1, ChangeModalStateAction$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }
}
