package com.uber.h3core.exceptions;

/* loaded from: classes11.dex */
public class H3Exception extends RuntimeException {
    private int code;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public H3Exception(int i) {
        super(r0);
        String str;
        switch (i) {
            case 0:
                str = "Success";
                break;
            case 1:
                str = "The operation failed but a more specific error is not available";
                break;
            case 2:
                str = "Argument was outside of acceptable range";
                break;
            case 3:
                str = "Latitude or longitude arguments were outside of acceptable range";
                break;
            case 4:
                str = "Resolution argument was outside of acceptable range";
                break;
            case 5:
                str = "Cell argument was not valid";
                break;
            case 6:
                str = "Directed edge argument was not valid";
                break;
            case 7:
                str = "Undirected edge argument was not valid";
                break;
            case 8:
                str = "Vertex argument was not valid";
                break;
            case 9:
                str = "Pentagon distortion was encountered";
                break;
            case 10:
                str = "Duplicate input";
                break;
            case 11:
                str = "Cell arguments were not neighbors";
                break;
            case 12:
                str = "Cell arguments had incompatible resolutions";
                break;
            case 13:
                str = "Memory allocation failed";
                break;
            case 14:
                str = "Bounds of provided memory were insufficient";
                break;
            case 15:
                str = "Mode or flags argument was not valid";
                break;
            case 16:
                str = "Index argument was not valid";
                break;
            case 17:
                str = "Base cell number was outside of acceptable range";
                break;
            case 18:
                str = "Child indexing digits invalid";
                break;
            case 19:
                str = "Child indexing digits refer to a deleted subsequence";
                break;
            default:
                str = "Unknown error";
                break;
        }
        this.code = i;
    }
}
