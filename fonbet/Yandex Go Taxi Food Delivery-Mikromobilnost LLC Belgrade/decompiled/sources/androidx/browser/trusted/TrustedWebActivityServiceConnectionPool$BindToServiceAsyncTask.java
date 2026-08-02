package androidx.browser.trusted;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import ru.cprocsp.ACSPTLSProxy.tools.Constants;

/* loaded from: classes10.dex */
class TrustedWebActivityServiceConnectionPool$BindToServiceAsyncTask extends AsyncTask<Void, Void, Exception> {
    private final Context mAppContext;
    private final ConnectionHolder mConnection;
    private final Intent mIntent;

    public TrustedWebActivityServiceConnectionPool$BindToServiceAsyncTask(Context context, Intent intent, ConnectionHolder connectionHolder) {
        this.mAppContext = context.getApplicationContext();
        this.mIntent = intent;
        this.mConnection = connectionHolder;
    }

    @Override // android.os.AsyncTask
    public Exception doInBackground(Void... voidArr) {
        try {
            if (this.mAppContext.bindService(this.mIntent, this.mConnection, Constants.INTENT_ADDRESS_ID)) {
                return null;
            }
            this.mAppContext.unbindService(this.mConnection);
            return new IllegalStateException("Could not bind to the service");
        } catch (SecurityException e) {
            return e;
        }
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(Exception exc) {
        if (exc != null) {
            this.mConnection.cancel(exc);
        }
    }
}
