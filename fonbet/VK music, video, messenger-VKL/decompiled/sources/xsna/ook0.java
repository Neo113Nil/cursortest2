package xsna;

/* compiled from: StackTraceSourceInfo.java */
/* loaded from: classes8.dex */
public final class ook0 implements ngk0 {
    public final StackTraceElement[] b;

    public ook0(StackTraceElement[] stackTraceElementArr) {
        this.b = stackTraceElementArr;
    }

    @Override // xsna.ngk0
    public final String h() {
        StackTraceElement[] stackTraceElementArr = this.b;
        if (stackTraceElementArr.length <= 0) {
            return "\tat unknown source";
        }
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (!stackTraceElement.getClassName().startsWith("io.opentelemetry.sdk.metrics") && !stackTraceElement.getClassName().startsWith("java.lang")) {
                sb.append("\tat ");
                sb.append(stackTraceElement);
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
