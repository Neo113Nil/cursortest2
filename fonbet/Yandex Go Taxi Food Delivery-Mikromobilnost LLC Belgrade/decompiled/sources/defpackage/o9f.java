package defpackage;

import android.credentials.ClearCredentialStateException;
import android.credentials.CreateCredentialException;
import android.credentials.CreateCredentialRequest;
import android.credentials.CreateCredentialResponse;
import android.credentials.CredentialManager;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import android.credentials.PrepareGetCredentialResponse;
import android.os.Bundle;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class o9f {
    public static /* synthetic */ void A() {
    }

    public static /* synthetic */ void B() {
    }

    public static /* synthetic */ void C() {
    }

    public static /* synthetic */ void D() {
    }

    public static /* synthetic */ ClearCredentialStateException a(String str, String str2) {
        return new ClearCredentialStateException(str, str2);
    }

    public static /* bridge */ /* synthetic */ ClearCredentialStateException b(Throwable th) {
        return (ClearCredentialStateException) th;
    }

    public static /* synthetic */ CreateCredentialException c(String str, String str2) {
        return new CreateCredentialException(str, str2);
    }

    public static /* bridge */ /* synthetic */ CreateCredentialException d(Throwable th) {
        return (CreateCredentialException) th;
    }

    public static /* synthetic */ CreateCredentialRequest.Builder e(String str, Bundle bundle, Bundle bundle2) {
        return new CreateCredentialRequest.Builder(str, bundle, bundle2);
    }

    public static /* bridge */ /* synthetic */ CreateCredentialResponse f(Object obj) {
        return (CreateCredentialResponse) obj;
    }

    public static /* bridge */ /* synthetic */ CredentialManager h(Object obj) {
        return (CredentialManager) obj;
    }

    public static /* synthetic */ GetCredentialException i(String str, String str2) {
        return new GetCredentialException(str, str2);
    }

    public static /* bridge */ /* synthetic */ GetCredentialException j(Throwable th) {
        return (GetCredentialException) th;
    }

    public static /* bridge */ /* synthetic */ GetCredentialResponse k(Object obj) {
        return (GetCredentialResponse) obj;
    }

    public static /* bridge */ /* synthetic */ PrepareGetCredentialResponse m(Object obj) {
        return (PrepareGetCredentialResponse) obj;
    }

    public static /* bridge */ /* synthetic */ Class p() {
        return SelectGesture.class;
    }

    public static /* synthetic */ void s() {
    }

    public static /* bridge */ /* synthetic */ Class x() {
        return SelectRangeGesture.class;
    }

    public static /* synthetic */ void y() {
    }

    public static /* bridge */ /* synthetic */ Class z() {
        return DeleteRangeGesture.class;
    }
}
