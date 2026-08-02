package yads;

/* loaded from: classes10.dex */
public abstract class ef3 {
    public static ff3 a(String str) {
        if (str == null) {
            str = "Ad request failed with network error";
        }
        return new ff3(str);
    }

    public static ff3 b() {
        return new ff3("Server temporarily unavailable. Please, try again later.");
    }

    public static ff3 b(String str) {
        return new ff3(str);
    }

    public static ff3 a(am0 am0Var) {
        String message = am0Var.getMessage();
        if (message == null) {
            message = "Ad request completed successfully, but there are no ads available.";
        }
        return new ff3(message);
    }

    public static ff3 a() {
        return new ff3("Internal error. Failed to parse response");
    }
}
