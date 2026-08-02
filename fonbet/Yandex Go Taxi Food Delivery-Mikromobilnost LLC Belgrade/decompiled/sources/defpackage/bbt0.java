package defpackage;

import ru.yandex.taxi.address.repository.AddressResolveRepository;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class bbt0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AddressResolveRepository.State.values().length];
        try {
            iArr[AddressResolveRepository.State.WAITING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AddressResolveRepository.State.LOADED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AddressResolveRepository.State.LOADING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[AddressResolveRepository.State.ERROR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[AddressResolveRepository.State.UNSUPPORTED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
