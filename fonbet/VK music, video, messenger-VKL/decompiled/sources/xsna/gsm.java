package xsna;

import com.vk.dialogslist.api.list.DialogsListConfigToken;

/* compiled from: DialogsListConfigFactory.kt */
/* loaded from: classes18.dex */
public interface gsm<Config> extends g4z {
    Config e(DialogsListConfigToken dialogsListConfigToken);

    <Token extends DialogsListConfigToken> void t(Class<Token> cls, a<Token, Config> aVar);

    /* compiled from: DialogsListConfigFactory.kt */
    public interface a<Token extends DialogsListConfigToken, Config> {
        Config e(Token token);

        default void onDestroy() {
        }
    }
}
