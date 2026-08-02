package defpackage;

import java.util.LinkedHashMap;

/* loaded from: classes14.dex */
public final class akk0 implements wrs0 {
    public final /* synthetic */ int b;
    public final LinkedHashMap c;

    public akk0(int i) {
        this.b = i;
        switch (i) {
            case 1:
                this.c = new LinkedHashMap();
                break;
            case 2:
                this.c = new LinkedHashMap();
                break;
            case 3:
                this.c = new LinkedHashMap();
                break;
            default:
                this.c = new LinkedHashMap();
                break;
        }
    }

    @Override // defpackage.wrs0
    public final LinkedHashMap getExtras() {
        switch (this.b) {
        }
        return this.c;
    }
}
