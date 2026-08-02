package defpackage;

/* loaded from: classes4.dex */
public final class bs7 implements ozc0 {
    public boolean a = false;
    public final e90 b;

    public bs7(e90 e90Var) {
        this.b = e90Var;
    }

    @Override // defpackage.ozc0
    public final boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (this.a || i != 9796) {
            return false;
        }
        this.a = true;
        int length = iArr.length;
        e90 e90Var = this.b;
        if (length == 0 || iArr[0] != 0) {
            e90Var.g(new as7("CameraAccessDenied", "Camera access permission was denied."));
            return true;
        }
        if (iArr.length <= 1 || iArr[1] == 0) {
            e90Var.g(null);
            return true;
        }
        e90Var.g(new as7("AudioAccessDenied", "Audio access permission was denied."));
        return true;
    }
}
