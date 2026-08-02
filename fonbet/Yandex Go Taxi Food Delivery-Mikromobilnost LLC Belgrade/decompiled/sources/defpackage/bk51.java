package defpackage;

/* loaded from: classes15.dex */
public final class bk51 extends pw91 {
    public static final bk51 b = new bk51(0);
    public static final bk51 c = new bk51(1);
    public static final bk51 d = new bk51(2);
    public static final bk51 e = new bk51(3);
    public final /* synthetic */ int a;

    public /* synthetic */ bk51(int i) {
        this.a = i;
    }

    @Override // defpackage.pw91
    public final Integer e() {
        switch (this.a) {
        }
        return Integer.valueOf(oyh0.ask_disk_space_delete_btn);
    }

    @Override // defpackage.pw91
    public final String f() {
        switch (this.a) {
        }
        return "https://disk.yandex.ru";
    }

    @Override // defpackage.pw91
    public final int q() {
        switch (this.a) {
            case 0:
                return oyh0.ask_disk_filesize_text;
            case 1:
                return oyh0.ask_disk_space_text;
            case 2:
                return oyh0.ask_disk_space_overflow_text;
            default:
                return oyh0.ask_disk_unhandled_error_text;
        }
    }

    @Override // defpackage.pw91
    public final int s(ek51 ek51Var) {
        switch (this.a) {
            case 0:
                return oyh0.ask_disk_filesize_title;
            case 1:
                return ek51Var.c.size() > 1 ? oyh0.ask_disk_space_title_many_files : oyh0.ask_disk_space_title;
            case 2:
                return oyh0.ask_disk_space_overflow_title;
            default:
                return oyh0.ask_disk_unhandled_error_title;
        }
    }
}
