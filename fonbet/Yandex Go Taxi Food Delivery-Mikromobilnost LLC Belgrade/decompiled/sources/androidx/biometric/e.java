package androidx.biometric;

import defpackage.pq60;

/* loaded from: classes10.dex */
public final class e implements pq60 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FingerprintDialogFragment b;

    public /* synthetic */ e(FingerprintDialogFragment fingerprintDialogFragment, int i) {
        this.a = i;
        this.b = fingerprintDialogFragment;
    }

    @Override // defpackage.pq60
    public final void a(Object obj) {
        int i = this.a;
        FingerprintDialogFragment fingerprintDialogFragment = this.b;
        switch (i) {
            case 0:
                Integer num = (Integer) obj;
                fingerprintDialogFragment.mHandler.removeCallbacks(fingerprintDialogFragment.mResetDialogRunnable);
                fingerprintDialogFragment.updateFingerprintIcon(num.intValue());
                fingerprintDialogFragment.updateHelpMessageColor(num.intValue());
                fingerprintDialogFragment.mHandler.postDelayed(fingerprintDialogFragment.mResetDialogRunnable, 2000L);
                break;
            default:
                fingerprintDialogFragment.mHandler.removeCallbacks(fingerprintDialogFragment.mResetDialogRunnable);
                fingerprintDialogFragment.updateHelpMessageText((CharSequence) obj);
                fingerprintDialogFragment.mHandler.postDelayed(fingerprintDialogFragment.mResetDialogRunnable, 2000L);
                break;
        }
    }
}
