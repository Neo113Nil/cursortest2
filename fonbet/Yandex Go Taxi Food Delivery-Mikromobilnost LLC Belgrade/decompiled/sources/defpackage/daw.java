package defpackage;

import com.yandex.go.zone.dto.objects.BulletsOrderPopup;

/* loaded from: classes14.dex */
public final class daw extends faw {
    public final BulletsOrderPopup a;

    public daw(BulletsOrderPopup bulletsOrderPopup) {
        this.a = bulletsOrderPopup;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof daw) && jl40.l(this.a, ((daw) obj).a);
    }

    public final int hashCode() {
        BulletsOrderPopup bulletsOrderPopup = this.a;
        if (bulletsOrderPopup == null) {
            return 0;
        }
        return bulletsOrderPopup.hashCode();
    }
}
